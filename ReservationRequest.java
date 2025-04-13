import java.util.Date;

public class ReservationRequest {
    private Passenger passenger;
    private Airport source;
    private Airport destination;
    private Date departureDate;
    private SeatType seatType;
    private SeatClass seatClass;

    public ReservationRequest(Passenger passenger, Airport source, Airport destination,
                              Date departureDate, SeatType seatType, SeatClass seatClass) {
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.seatType = seatType;
        this.seatClass = seatClass;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Airport getSource() {
        return source;
    }

    public Airport getDestination() {
        return destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }
}
