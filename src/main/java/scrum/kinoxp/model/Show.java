package scrum.kinoxp.model;

import java.util.List;

public class Show {

    private int id;
    private Movie movie;
    private List<Booking> bookings;
    private String date_time;
    private Theater theater;

    public Show() {
    }

    public Show(int id, Movie movie, List<Booking> bookings, String date_time, Theater theater) {
        this.movie = movie;
        this.id = id;
        this.bookings = bookings;
        this.date_time = date_time;
        this.theater = theater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", movie=" + movie +
                ", bookings=" + bookings +
                ", date_time='" + date_time + '\'' +
                ", theater=" + theater +
                '}';
    }
}
