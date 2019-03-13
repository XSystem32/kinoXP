package scrum.kinoxp.model;

import java.util.List;

public class Show {

    private int id;
    private List<Booking> bookings;
    private String date_time;

    public Show() {
    }

    public Show(int id, List<Booking> bookings, String date_time) {
        this.id = id;
        this.bookings = bookings;
        this.date_time = date_time;
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

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", bookings=" + bookings +
                ", date_time='" + date_time + '\'' +
                '}';
    }
}
