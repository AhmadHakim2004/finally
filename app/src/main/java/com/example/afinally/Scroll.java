package com.example.afinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Scroll extends AppCompatActivity {

    ArrayList<Event> events = new ArrayList<Event>();
    AdapterMyEvents adapter;
    Button btn;
//    Event arsenal = new Event("Emirates Stadium", "soccer", "",  5, 7, 22, 22);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        RecyclerView recyclerView = findViewById(R.id.rovi);
        setUpEvents();
        adapter = new AdapterMyEvents(this, events);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        btn = findViewById(R.id.button5);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                adapter.events.remove(arsenal);
//                events.remove(arsenal);
//            }
//        });
    }

    public void clik(View view) {


//        adapter.events.remove();

//        TextView makan, ryada, wa2t, av, sLeft;
//        makan = findViewById(R.id.venue);
//        ryada = findViewById(R.id.sport);
//        wa2t = findViewById(R.id.timee);
//        av = findViewById(R.id.capacity);
//        sLeft = findViewById(R.id.spots);
//
//        String makanS = makan.getText().toString();
//        String ryadaS = ryada.getText().toString();
//        String wa2tS = wa2t.getText().toString();
//        int avS = Integer.parseInt(av.getText().toString());
//        int sLeftS = Integer.parseInt(sLeft.getText().toString());
//        String[] ss = wa2tS.split(":||-");
//        int start = Integer.parseInt(ss[0]);
//        int end= Integer.parseInt(ss[2]);
//
//        Event e = new Event(makanS, ryadaS, "", start, end, avS, sLeftS);
//
//        adapter.events.remove(e);
//        events.remove(e);
//
//
//
//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.activity_popup);
//        dialog.show();
//
    }

    private void setUpEvents(){
        //read events from database into events
//        Date date = new Date();
        events.add(new Event("Emirates Stadium", "soccer", "",  5, 7, 22, 22));
        events.add(new Event("bbb", "basketball", "",  3, 5, 10, 10));
        events.add(new Event("ccc", "soccer", "", 5, 7, 22, 22));
        events.add(new Event("ddd", "basketball", "", 3, 5, 10, 0));
        events.add(new Event("eee", "basketball", "", 3, 5, 10, 10));
        events.add(new Event("fff", "tennis", "", 10, 12, 2, 2));
        events.add(new Event("ggg", "soccer", "", 5, 7, 22, 2));
        events.add(new Event("hhh", "tennis", "", 10, 12, 2, 2));
        events.add(new Event("iii", "soccer", "", 5, 7, 22, 22));
        events.add(new Event("jjj", "basketball", "", 3, 5, 10, 10));
        events.add(new Event("kkk", "basketball", "", 1, 2, 10, 0));
        events.add(new Event("PANAM", "soccer", "", 5, 7, 22, 22));
        events.add(new Event("JALAA", "soccer", "", 5, 7, 22, 2));
        events.add(new Event("ISKAN", "soccer", "", 12, 5, 22, 22));
        events.add(new Event("Camp Nou", "soccer", "", 5, 7, 22, 22));
    }
}