package scrum.kinoxp.model;

public class Theater {
    private int id;
    private int amountOfSeats;


    public Theater() {
    }

    public Theater(int id, int amountOfSeats) {
        this.id = id;
        this.amountOfSeats = amountOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id=" + id +
                ", amountOfSeats=" + amountOfSeats +
                '}';
    }
}
