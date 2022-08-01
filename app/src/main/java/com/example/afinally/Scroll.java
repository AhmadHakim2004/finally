package com.example.afinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;

public class Scroll extends AppCompatActivity {

    ArrayList<Event> events = new ArrayList<Event>();
    AdapterMyEvents adapterMY;
    AdapterUpcomingEvents adapterUP;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        setUpEvents();
        Intent intent = getIntent();
        String indicator = intent.getStringExtra("ind");
        if(indicator.equals("up")) {
            AdapterUpcomingEvents adapter =new AdapterUpcomingEvents(this, events);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        else{
            AdapterMyEvents adapter = new AdapterMyEvents(this, events);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    private void setUpEvents(){
        //read events from database into events
        Date date = new Date();
        ArrayList<String> ps = new ArrayList<String>();
        events.add(new Event("Emirates Stadium", "soccer", "", date,  5, 7, 22, 22, ps));
        events.add(new Event("bbb", "basketball", "", date,  3, 5, 10, 10, ps));
        events.add(new Event("ccc", "soccer", "", date, 5, 7, 22, 22, ps));
        events.add(new Event("ddd", "basketball", "", date, 3, 5, 10, 0, ps));
        events.add(new Event("eee", "basketball", "", date, 3, 5, 10, 10, ps));
        events.add(new Event("fff", "tennis", "", date, 10, 12, 2, 2, ps));
        events.add(new Event("ggg", "soccer", "", date, 5, 7, 22, 2, ps));
        events.add(new Event("hhh", "tennis", "", date, 10, 12, 2, 2, ps));
        events.add(new Event("iii", "soccer", "", date, 5, 7, 22, 22, ps));
        events.add(new Event("jjj", "basketball", "", date, 3, 5, 10, 10, ps));
        events.add(new Event("kkk", "basketball", "", date, 1, 2, 10, 0, ps));
        events.add(new Event("PANAM", "soccer", "", date, 5, 7, 22, 22, ps));
        events.add(new Event("JALAA", "soccer", "", date, 5, 7, 22, 2, ps));
        events.add(new Event("ISKAN", "soccer", "", date, 12, 5, 22, 22, ps));
        events.add(new Event("Camp Nou", "soccer", "", date, 5, 7, 22, 22, ps));
    }
}