package classes.ex12;

import java.time.Duration;
import java.time.LocalDateTime;

public class Airplane {
    private int number;
    private String destination;
    private String departure;
    private LocalDateTime time;

    public Airplane(int number, String destination, String departure, LocalDateTime time) {
        this.number = number;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void getStatus() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(time, now);
        System.out.println("duration: " + duration);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", time=" + time +
                '}';
    }
}
