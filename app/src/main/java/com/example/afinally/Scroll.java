package com.example.afinally;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Scroll extends AppCompatActivity {

    ArrayList<Event> events = new ArrayList<Event>();
    AdapterMyEvents adapterMY;
    AdapterUpcomingEvents adapterUP;
    Button btn;

    @RequiresApi(api = Build.VERSION_CODES.O)
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

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setUpEvents(){
        //read events from database into events
        LocalDate date1 = LocalDate.of(2022, 8, 2);
        LocalDate date2 = LocalDate.of(2022, 8, 3);
        LocalDate date3 = LocalDate.of(2022, 8, 4);
        LocalDate date4 = LocalDate.of(2022, 8, 5);
        ArrayList<String> ps = new ArrayList<String>();
        events.add(new Event("Emirates Stadium", "soccer", "", date2, 5, 7, 22, 22, ps));
        events.add(new Event("bbb", "basketball", "", date1,  3, 5, 10, 10, ps));
        events.add(new Event("ccc", "soccer", "", date2, 5, 7, 22, 22, ps));
        events.add(new Event("ddd", "basketball", "", date2, 3, 5, 10, 0, ps));
        events.add(new Event("eee", "basketball", "", date2, 3, 5, 10, 10, ps));
        events.add(new Event("fff", "tennis", "", date3, 10, 12, 2, 2, ps));
        events.add(new Event("ggg", "soccer", "", date3, 5, 7, 22, 2, ps));
        events.add(new Event("hhh", "tennis", "", date4, 10, 12, 2, 2, ps));
        events.add(new Event("iii", "soccer", "", date4, 5, 7, 22, 22, ps));
        events.add(new Event("jjj", "basketball", "", date4, 13, 15, 10, 10, ps));
        events.add(new Event("kkk", "basketball", "", date4, 1, 2, 10, 0, ps));
        events.add(new Event("PANAM", "soccer", "", date1, 5, 7, 22, 22, ps));
        events.add(new Event("JALAA", "soccer", "", date2, 5, 7, 22, 2, ps));
        events.add(new Event("ISKAN", "soccer", "", date3, 12, 15, 22, 22, ps));
        events.add(new Event("Camp Nou", "soccer", "", date4, 5, 7, 22, 22, ps));
        Collections.sort(events);
    }
}