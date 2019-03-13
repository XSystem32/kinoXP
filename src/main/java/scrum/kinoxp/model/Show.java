package scrum.kinoxp.model;

import java.util.List;

public class Show {

    private int id;
    private int movieId;
    private List<Booking> bookings;
    private String date_time;
    private Theater theater;
    private int theatreId;

    public Show() {
    }



    public Show(int id, int movieId, List<Booking> bookings, String date_time, Theater theater) {
        this.movieId = movieId;
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

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movie) {
        this.movieId = movie;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", bookings=" + bookings +
                ", date_time='" + date_time + '\'' +
                ", theater=" + theater +
                '}';
    }
}
