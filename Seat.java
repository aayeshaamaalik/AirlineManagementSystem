public class Seat {
    private String seatNumber;
    private SeatType seatType;
    private SeatClass seatClass;
    private boolean isBooked;

    public Seat(String seatNumber, SeatType seatType, SeatClass seatClass) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatClass = seatClass;
        this.isBooked = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        this.isBooked = true;
    }

    public void release() {
        this.isBooked = false;
    }
}
