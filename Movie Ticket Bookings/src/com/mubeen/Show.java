package com.mubeen;

import java.util.Date;

public class Show {
    private int showId;
    private Date showTime;



    private int availableSeats;

    private Theatre theatre;
    private Movie movie;

    public Show(int showId, Date showTime ,
                Theatre theatre, Movie movie) {
        this.showId = showId;
        this.showTime = showTime;
        this.theatre = theatre;
        this.movie = movie;
        this.availableSeats = theatre.getCapacity();
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
