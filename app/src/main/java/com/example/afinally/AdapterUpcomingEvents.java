//package com.example.afinally;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class AdapterUpcomingEvents extends RecyclerView.Adapter<AdapterUpcomingEvents.MyViewHolder> {
//
//    Context context;
//    ArrayList<Event> events;
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View view = inflater.inflate(R.layout.event, parent, false);
//        return new AdapterUpcomingEvents.MyViewHolder(view).linkAdapter(this);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder{
//
//        TextView makan, ryada, wa2t, av, sLeft;
//        Button butt;
//        private AdapterUpcomingEvents adapter;
//
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            makan = itemView.findViewById(R.id.venue);
//            ryada = itemView.findViewById(R.id.sport);
//            wa2t = itemView.findViewById(R.id.timee);
//            av = itemView.findViewById(R.id.capacity);
//            sLeft = itemView.findViewById(R.id.spots);
//            butt = itemView.findViewById(R.id.button5);
//
//        }
//
//        public MyViewHolder linkAdapter(AdapterUpcomingEvents adapter){
//            this.adapter = adapter;
//            return this;
//        }
//    }
//}
