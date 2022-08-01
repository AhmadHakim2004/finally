package com.example.afinally;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

public class Venue {
    /*
    Location
    Sports
    Image
    Start Time
    End Time
    Arr of events
     */
    String name;
    String location;
    ArrayList<String> sports;
    ArrayList<Event> events;
    String image;
    String start, end;


    public Venue(String name, String location, ArrayList<String> sports, ArrayList<Event> events, String image, String start, String end) {
        this.name = name;
        this.location = location;
        this.sports = sports;
        this.events = events;
        this.image = image;
        this.start = start;
        this.end = end;
    }

    public String getName() {return name;}

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getSports() {
        return sports;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public String getImage() {
        return image;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}
