package scrum.kinoxp.model;

import java.util.List;

public class Booking {
    private int id;
    private Customer customer;
    private List<Seat> seats;

    public Booking() {
    }

    public Booking(int id, Customer customer, List<Seat> seats) {
        this.id = id;
        this.customer = customer;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", customer=" + customer +
                ", seats=" + seats +
                '}';
    }
}
