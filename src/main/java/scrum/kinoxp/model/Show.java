package scrum.kinoxp.model;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private int id;
    private int movieId;
    private List<Booking> bookings;
    private String date_time;
    private Theatre theatre;
    private int theatreId;
    private ArrayList<Seat> seats = new ArrayList<>();

    public Show() {
    }



    public Show(int id, int movieId, List<Booking> bookings, String date_time, Theatre theatre) {
        this.movieId = movieId;
        this.id = id;
        this.bookings = bookings;
        this.date_time = date_time;
        this.theatre = theatre;
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

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
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

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void generateSeats(){
        int amountOfSeats = theatre.getRowLength() * theatre.getAmountOfRows();

        for (int i = 0; i < amountOfSeats; i++){
            seats.add(new Seat(i, false));
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", bookings=" + bookings +
                ", date_time='" + date_time + '\'' +
                ", theatre=" + theatre +
                '}';
    }
}
