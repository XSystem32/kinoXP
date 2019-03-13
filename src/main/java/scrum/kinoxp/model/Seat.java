package scrum.kinoxp.model;

public class Seat {

    private int id;
    private boolean taken;

    public Seat() {
    }

    public Seat(int id, boolean taken) {
        this.id = id;
        this.taken = taken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", taken=" + taken +
                '}';
    }
}
