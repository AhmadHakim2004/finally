package com.example.afinally;

import android.media.Image;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Event {
    /*
    Venue/Location
    Sport
    Image
    Date
    Start Time
    End Time
    Capacity
    Spots Left
    Players
     */
    String location, sport, image;
    Date date;
    int start, end, capacity, spotsLeft;
    ArrayList<String> players;

    public Event(String location, String sport, String image, Date date, int start, int end, int capacity, int spotsLeft, ArrayList<String> players) {
        this.location = location;
        this.sport = sport;
        this.image = image;
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.spotsLeft = spotsLeft;
        this.date = date;
        this.players = players;
    }




    public String getLocation() {
        return location;
    }

    public String getSport() {
        return sport;
    }

    public String getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpotsLeft() {
        return spotsLeft;
    }

    public ArrayList<String> getPlayers(){return players;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return start == event.start && end == event.end && capacity == event.capacity && spotsLeft == event.spotsLeft && location.equals(event.location) && sport.equals(event.sport) && image.equals(event.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, sport, image, start, end, capacity, spotsLeft);
    }
}
