package uaslp.enginering.exam.model;

public enum RoomStatus {
    CLEAN, DIRTY;

    private int roomNumber;
    private String status;


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
