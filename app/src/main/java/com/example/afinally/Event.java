package com.example.afinally;

import android.media.Image;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Event implements Serializable {
    /*
    Venue
    Sport
    Image
    Start Time
    End Time
    Date
    Capacity
    Spots Left
     */
    String location, sport, image;
//    Date date;
    int start, end, capacity, spotsLeft;

    public Event(String location, String sport, String image, int start, int end, int capacity, int spotsLeft) {
        this.location = location;
        this.sport = sport;
        this.image = image;
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.spotsLeft = spotsLeft;
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

//    public Date getDate() {
//        return date;
//    }

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
