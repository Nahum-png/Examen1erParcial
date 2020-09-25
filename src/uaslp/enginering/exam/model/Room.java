package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Room {
    private ArrayList<Room> rooms;
    private int number;
    private String status;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
