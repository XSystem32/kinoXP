package scrum.kinoxp.model;

public class Seat {

    private int id;
    private boolean take;

    public Seat() {
    }

    public Seat(int id, boolean take) {
        this.id = id;
        this.take = take;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTake() {
        return take;
    }

    public void setTake(boolean take) {
        this.take = take;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", take=" + take +
                '}';
    }
}
