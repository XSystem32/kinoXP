package scrum.kinoxp.model;

import javax.naming.Name;
import java.util.List;

public class Booking {
    private int id;
    private String name;
    private Show show;
    private List<Seat> seats;

    public Booking() {
    }

    public Booking(int id, String name, Show show, List<Seat> seats) {
        this.id = id;
        this.name = name;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", show=" + show +
                ", seats=" + seats +
                '}';
    }
}
