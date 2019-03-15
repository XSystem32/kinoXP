package scrum.kinoxp.model;

import java.util.ArrayList;

public class Row {
    private int length;
    private ArrayList<Seat> seats = new ArrayList<>();
    int id;

    public Row(int id, int length) {
        this.length = length;
        this.id = id;
        generateSeats();
    }

    public Row() {
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void generateSeats(){
        for (int i = 0; i < length; i++) {
            seats.add(new Seat(i + (id * length), false));
        }
    }

    @Override
    public String toString() {
        return "Row{" +
                "length=" + length +
                ", seats=" + seats +
                '}';
    }
}
