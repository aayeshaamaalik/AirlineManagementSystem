import java.util.*;

public class AirlineManagementSystem {
    private List<Airline> airlines;
    private List<Airport> airports;
    private List<Reservation> reservations;

    public AirlineManagementSystem() {
        this.airlines = new ArrayList<>();
        this.airports = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public List<FlightInstance> searchFlights(ReservationRequest request) {
        List<FlightInstance> matchingFlights = new ArrayList<>();

        for (Airline airline : airlines) {
            for (Flight flight : airline.getFlights()) {
                if (flight instanceof FlightInstance fi) {
                    if (fi.getSource().equals(request.getSource())
                            && fi.getDestination().equals(request.getDestination())
                            && isSameDay(fi.getDepartureTime(), request.getDepartureDate())
                            && fi.getStatus() == FlightStatus.SCHEDULED) {

                        matchingFlights.add(fi);
                    }
                }
            }
        }

        return matchingFlights;
    }

    public Reservation bookFlight(FlightInstance flight, Passenger passenger, SeatClass seatClass, SeatType seatType, Payment payment) {
        for (Seat seat : flight.getAircraft().getSeats()) {
            if (!seat.isBooked()
                    && seat.getSeatClass() == seatClass
                    && seat.getSeatType() == seatType) {

                seat.book();
                Reservation reservation = new Reservation(flight, passenger, seat, payment);
                reservations.add(reservation);
                return reservation;
            }
        }
        return null; // No seat available
    }

    public boolean cancelReservation(String reservationId) {
        for (Reservation res : reservations) {
            if (res.getReservationId().equals(reservationId) && res.getStatus() == ReservationStatus.CONFIRMED) {
                res.cancel();
                res.getSeat().release();
                return true;
            }
        }
        return false;
    }

    private boolean isSameDay(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        return c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)
                && c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public List<Airport> getAirports() {
        return airports;
    }
}
