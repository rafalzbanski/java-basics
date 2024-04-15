package classes.ex12;

import classes.ex11.Book;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime yearOfFoundation = LocalDateTime.of(1990, 7,12,9,0,0);
        Airport airport = new Airport("Chopin Airport", yearOfFoundation);

        LocalDateTime planeTime1 = LocalDateTime.of(2024, 4,3,8,30,0);
        Airplane plane1 = new Airplane(1, "Poland", "Zanzibar", planeTime1);

        LocalDateTime planeTime2 = LocalDateTime.of(2024, 6,3,8,30,0);
        Airplane plane2 = new Airplane(2, "Wroclaw", "Ohio", planeTime1);

        LocalDateTime planeTime3 = LocalDateTime.of(2024, 4,12,8,30,0);
        Airplane plane3 = new Airplane(3, "Berlin", "Moscow", planeTime1);

        LocalDateTime planeTime4 = LocalDateTime.of(2024, 4,1,8,30,0);
        Airplane plane4 = new Airplane(4, "Portland", "Dubai", planeTime1);

        LocalDateTime planeTime5 = LocalDateTime.of(2024, 12,3,8,30,0);
        Airplane plane5 = new Airplane(5, "Paris", "Berlin", planeTime1);

        System.out.println("The airport: " + airport.getName() + "\nYear of foundation: " + airport.getFoundationDate());
        System.out.println("-------------------");
        System.out.println("Flights in the Airport:\n");
        for (Airplane plane: airport.getFlights()) {
            System.out.println(plane.toString());
        }

        System.out.println("Update the flights list....");

        airport.addFlight(plane1);
        airport.addFlight(plane2);
        airport.addFlight(plane3);
        airport.addFlight(plane4);
        airport.addFlight(plane5);

        System.out.println("-------------------");
        System.out.println("Flights in the Airport:\n");
        for (Airplane plane: airport.getFlights()) {
            System.out.println(plane.toString());
        }

    }
}
