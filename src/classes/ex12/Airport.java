package classes.ex12;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Airport {
    private String name;
    private LocalDateTime foundationDate;
    private ArrayList<Airplane> flights;

    public Airport(String name, LocalDateTime foundationDate) {
        this.name = name;
        this.foundationDate = foundationDate;
        flights = new ArrayList<Airplane>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDateTime foundationDate) {
        this.foundationDate = foundationDate;
    }

    public ArrayList<Airplane> getFlights() {
        return flights;
    }

    public void addFlight (Airplane airplane) {
        flights.add(airplane);
    }

    public void removeFlight (Airplane airplane) {
        flights.remove(airplane);
    }
}
