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
    String location;
    ArrayList<String> sports;
    List<Event> events;
    Image image;
    int start, end;


    public Venue(String location, ArrayList<String> sports, List<Event> events, Image image, int start, int end) {
        this.location = location;
        this.sports = sports;
        this.events = events;
        this.image = image;
        this.start = start;
        this.end = end;
    }


    public String getLocation() {
        return location;
    }

    public ArrayList<String> getSports() {
        return sports;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Image getImage() {
        return image;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
