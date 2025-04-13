import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    private List<FlightInstance> flightSegments;
    private double totalDuration; // in hours

    public Itinerary() {
        this.flightSegments = new ArrayList<>();
        this.totalDuration = 0.0;
    }

    public void addFlightSegment(FlightInstance flightInstance) {
        flightSegments.add(flightInstance);
        totalDuration += flightInstance.getDuration();
    }

    public List<FlightInstance> getFlightSegments() {
        return flightSegments;
    }

    public double getTotalDuration() {
        return totalDuration;
    }
}
