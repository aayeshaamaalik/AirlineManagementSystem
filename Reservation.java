import java.util.Date;
import java.util.UUID;

public class Reservation {
    private String reservationId;
    private FlightInstance flightInstance;
    private Passenger passenger;
    private Seat seat;
    private ReservationStatus status;
    private Date bookingDate;
    private Payment payment;

    public Reservation(FlightInstance flightInstance, Passenger passenger, Seat seat, Payment payment) {
        this.reservationId = UUID.randomUUID().toString();
        this.flightInstance = flightInstance;
        this.passenger = passenger;
        this.seat = seat;
        this.status = ReservationStatus.CONFIRMED;
        this.bookingDate = new Date();
        this.payment = payment;
    }

    public String getReservationId() {
        return reservationId;
    }

    public FlightInstance getFlightInstance() {
        return flightInstance;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void cancel() {
        this.status = ReservationStatus.CANCELLED;
    }
}
