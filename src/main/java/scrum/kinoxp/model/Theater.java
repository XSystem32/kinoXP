package scrum.kinoxp.model;

import java.util.ArrayList;

public class Theater {
    private int id;
    private int rowLength;
    private int amountOfRows;


    public Theater() {
    }

    public Theater(int id, int rowLength, int amountOfRows) {
        this.id = id;
        this.rowLength = rowLength;
        this.amountOfRows = amountOfRows;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getRowLength() {
        return rowLength;
    }

    public void setRowLength(int rowLength) {
        this.rowLength = rowLength;
    }

    public int getAmountOfRows() {
        return amountOfRows;
    }

    public void setAmountOfRows(int amountOfRows) {
        this.amountOfRows = amountOfRows;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id=" + id +
                ", rowLength=" + rowLength +
                ", amountOfRows=" + amountOfRows +
                '}';
    }
}
