package com.mubeen;

import java.util.ArrayList;

public class Theatre {
    private int theatreId;
    private String name;
    private int capacity;
    private String location;

    private ArrayList<Show> shows;

    public Theatre(int theatreId, String name, int capacity, String location) {
        this.theatreId = theatreId;
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.shows = new ArrayList<>();
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
