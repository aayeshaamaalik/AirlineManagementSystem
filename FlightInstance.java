import java.util.Date;
import java.util.List;

public class FlightInstance implements Flight {
    private String flightNumber;
    private Airport source;
    private Airport destination;
    private Airline airline;
    private Date departureTime;
    private Date arrivalTime;
    private FlightStatus status;
    private Aircraft aircraft;
    private List<Crew> crewList;

    public FlightInstance(String flightNumber, Airport source, Airport destination, Airline airline,
                          Date departureTime, Date arrivalTime, FlightStatus status, Aircraft aircraft,
                          List<Crew> crewList) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
        this.aircraft = aircraft;
        this.crewList = crewList;
    }

    @Override
    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public Airport getSource() {
        return source;
    }

    @Override
    public Airport getDestination() {
        return destination;
    }

    @Override
    public Airline getAirline() {
        return airline;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public List<Crew> getCrewList() {
        return crewList;
    }

    public double getDuration() {
        long millis = arrivalTime.getTime() - departureTime.getTime();
        return millis / (1000.0 * 60 * 60); // convert to hours
    }
}
