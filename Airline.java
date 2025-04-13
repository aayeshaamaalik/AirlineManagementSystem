import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private String code;
    private List<Flight> flights;
    private List<Aircraft> aircrafts;

    public Airline(String name, String code) {
        this.name = name;
        this.code = code;
        this.flights = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void removeAircraft(Aircraft aircraft) {
        aircrafts.remove(aircraft);
    }
}
