package scrum.kinoxp.model;

import java.util.List;

public class Show {

    private int id;
    private List<Booking> bookings;
    private Movie movie;
    private String date_time;
    private List<Seat> seats;

    public Show() {
    }

    public Show(int id, List<Booking> bookings, Movie movie, String date_time, List<Seat> seats) {
        this.id = id;
        this.bookings = bookings;
        this.movie = movie;
        this.date_time = date_time;
        this.seats = seats;
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

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", bookings=" + bookings +
                ", movie=" + movie +
                ", date_time='" + date_time + '\'' +
                ", seats=" + seats +
                '}';
    }
}
