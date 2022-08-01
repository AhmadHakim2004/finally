package com.example.afinally;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMyEvents extends RecyclerView.Adapter<AdapterMyEvents.MyViewHolder>{

    Context context;
    ArrayList<Event> events;

    public AdapterMyEvents(Context context, ArrayList<Event> events){
        this.context = context;
        this.events = events;
    }

    public String getTime(int time){
        String timeS;
        if (time == 0) timeS = "12AM";
        else if (0 < time && time < 12) timeS = String.valueOf(time) + "AM";
        else timeS = String.valueOf(time -12) + "PM";
        return timeS;
    }


    @NonNull
    @Override
    public AdapterMyEvents.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.event_my, parent,false);
        return new AdapterMyEvents.MyViewHolder(view).linkAdapter(this);
    }



    @Override
    public void onBindViewHolder(@NonNull AdapterMyEvents.MyViewHolder holder, int position) {
        Event event = events.get(position);
        holder.location.setText(event.getLocation());
        holder.sport.setText(event.getSport());

        String start = getTime(event.getStart()) ;
        String end = getTime(event.getEnd());
        holder.time.setText(start + "-" + end);
        holder.cap.setText("Capacity: "+event.getCapacity());
        holder.sLeft.setText("Spot(s) left: "+event.getSpotsLeft());
        holder.btn.setText("X");

    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView location, sport, time, cap, sLeft;
        Button btn, yes, no;
        private AdapterMyEvents adapter;
        private AlertDialog.Builder d_builder;
        private AlertDialog dialog;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            location = itemView.findViewById(R.id.venue_my);
            sport = itemView.findViewById(R.id.sport_my);
            time = itemView.findViewById(R.id.timee_my);
            cap = itemView.findViewById(R.id.capacity_my);
            sLeft = itemView.findViewById(R.id.spots_my);
            btn = itemView.findViewById(R.id.button_my);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    createDialog();
                }
            });

        }

        private void createDialog() {
            d_builder = new AlertDialog.Builder(adapter.context);
            LayoutInflater inflater2 = LayoutInflater.from(adapter.context);
            View view = inflater2.inflate(R.layout.yes_or_no, null);
            yes = view.findViewById(R.id.yes);
            no = view.findViewById(R.id.no);
            d_builder.setView(view);
            dialog = d_builder.create();
            dialog.show();

            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    adapter.events.remove(getAdapterPosition());
                    adapter.notifyItemRemoved(getAdapterPosition());
                    dialog.dismiss();
                }
            });

            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });



        }

        public MyViewHolder linkAdapter(AdapterMyEvents adapter){
            this.adapter = adapter;
            return this;
        }
    }
}
