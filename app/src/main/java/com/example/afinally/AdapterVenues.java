package com.example.afinally;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class AdapterVenues extends RecyclerView.Adapter<AdapterVenues.MyViewHolder>{

    private final RecycleViewInterface recycleViewInterface;
    Context context;
    ArrayList<Venue> venues;

    public AdapterVenues(Context context, ArrayList<Venue> venues, RecycleViewInterface recycleViewInterface)
    {
        this.recycleViewInterface = recycleViewInterface;
        this.context = context;
        this.venues = venues;
    }

    @NonNull
    @Override
    public AdapterVenues.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.venue, parent, false);
        return new AdapterVenues.MyViewHolder(view, recycleViewInterface).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVenues.MyViewHolder holder, int position) {

        Venue venue = venues.get(position);
        holder.location.setText(venue.getLocation());
        holder.timeStart.setText(venue.getStart());
        holder.timeEnd.setText(venue.getEnd());
        holder.venueName.setText(venue.getName());
    }

    @Override
    public int getItemCount() {
        return venues.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView location, timeStart, timeEnd, venueName;
        private AdapterVenues adapter;

        public MyViewHolder(@NonNull View itemView, RecycleViewInterface recycleViewInterface){
            super(itemView);
            location  = itemView.findViewById(R.id.location);
            venueName = itemView.findViewById(R.id.venueName);
            timeStart = itemView.findViewById((R.id.timeStart));
            timeEnd = itemView.findViewById(R.id.timeEnd);

            itemView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recycleViewInterface != null)
                    {
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION)
                        {
                            recycleViewInterface.onItemClick(pos);
                        }
                    }
                }
            }));
        }

        public MyViewHolder linkAdapter(AdapterVenues adapter)
        {
            this.adapter = adapter;
            return this;
        }
    }
}
