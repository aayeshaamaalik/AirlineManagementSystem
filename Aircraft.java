import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String name;
    private String model;
    private List<Seat> seats;

    public Aircraft(String name, String model) {
        this.name = name;
        this.model = model;
        this.seats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }
}
