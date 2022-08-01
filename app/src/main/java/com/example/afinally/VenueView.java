package com.example.afinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class VenueView extends AppCompatActivity {

    ArrayList<Event> venueEvents = new ArrayList<Event>();
    AdapterMyEvents adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_view);

        Bundle bundleObject = getIntent().getExtras();
        venueEvents = (ArrayList<Event>) bundleObject.getSerializable("venue_events");
        setContentView(R.layout.activity_venue_view);
        RecyclerView recyclerView = findViewById(R.id.recycleVenueView);
        adapter = new AdapterMyEvents(this, venueEvents);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}

