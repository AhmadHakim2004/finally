package com.example.afinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ViewVenues extends AppCompatActivity implements RecycleViewInterface{

    ArrayList<Venue> venues = new ArrayList<>();
    AdapterVenues adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_venues);

        RecyclerView recyclerView  = findViewById(R.id.roviVenue);
        setUpVenues();
        SpacingItemDecorator itemDecorator = new SpacingItemDecorator(10);
        recyclerView.addItemDecoration(itemDecorator);
        adapter = new AdapterVenues(this, venues, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpVenues()
    {
        ArrayList<String> sportsAll = new ArrayList<String>();
        sportsAll.add("soccer");
        sportsAll.add("football");

        ArrayList<Event> eventsAll = new ArrayList<Event>() {};
        eventsAll.add(new Event("Emirates Stadium", "soccer", "",  5, 7, 22, 22));
        eventsAll.add(new Event("Emirates house", "soccer", "",  5, 7, 22, 22));

        //read venues from from database
        venues.add(new Venue("Pan am", "morning side", sportsAll, eventsAll, "", "8", "10" ));
        venues.add(new Venue("soccerplex", "morning side", sportsAll, eventsAll, "", "8", "10" ));
        venues.add(new Venue("utsc", "morning side", sportsAll, eventsAll, "", "8", "10"));
        venues.add(new Venue("vikrams house", "morning side", sportsAll, eventsAll, "", "8", "10" ));
        venues.add(new Venue("ahmads mansion", "morning side", sportsAll, eventsAll, "", "8", "10" ));
        venues.add(new Venue("dhurvs strip club", "morning side", sportsAll, eventsAll, "", "8", "10"));
        venues.add(new Venue("priyanks walmart", "morning side", sportsAll, eventsAll, "", "8", "10" ));
        venues.add(new Venue("asads no frills", "morning side", sportsAll, eventsAll, "", "8", "10" ));

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(ViewVenues.this, VenueView.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("venue_events", venues.get(position).getEvents());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}