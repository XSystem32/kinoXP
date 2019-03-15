package scrum.kinoxp.model;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int id;
    private String name;
    private int showId;
    private List<String> seats = new ArrayList<>();

    public Booking() {
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

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public void setShowId(String showId) {
        this.showId = Integer.parseInt(showId);
    }


    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", showId=" + showId +
                ", seats=" + seats +
                '}';
    }
}
