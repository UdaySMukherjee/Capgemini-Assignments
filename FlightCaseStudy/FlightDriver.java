package FlightCaseStudy;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class FlightDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightScheduleManager manager = new FlightScheduleManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Flight Schedule Menu ===");
            System.out.println("1. Add Domestic Flight");
            System.out.println("2. Add International Flight");
            System.out.println("3. Book Flight");
            System.out.println("4. View Available Flights (Time Range)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Flight ID: ");
                    int dId = sc.nextInt();
                    System.out.print("Enter Departure Time (HH:MM): ");
                    LocalTime dDeparture = LocalTime.parse(sc.next());
                    System.out.print("Enter Arrival Time (HH:MM): ");
                    LocalTime dArrival = LocalTime.parse(sc.next());
                    System.out.print("Enter Available Seats: ");
                    int dSeats = sc.nextInt();
                    System.out.print("Enter State Code: ");
                    int stateCode = sc.nextInt();

                    Flight domestic = new DomesticFlight(dId, dDeparture, dArrival, dSeats, stateCode);
                    manager.addFlight(domestic);
                    System.out.println("Domestic flight added.");
                    break;

                case 2:
                    System.out.print("Enter Flight ID: ");
                    int iId = sc.nextInt();
                    System.out.print("Enter Departure Time (HH:MM): ");
                    LocalTime iDeparture = LocalTime.parse(sc.next());
                    System.out.print("Enter Arrival Time (HH:MM): ");
                    LocalTime iArrival = LocalTime.parse(sc.next());
                    System.out.print("Enter Available Seats: ");
                    int iSeats = sc.nextInt();
                    System.out.print("Enter Country Code: ");
                    int countryCode = sc.nextInt();

                    Flight international = new InternationalFlight(iId, iDeparture, iArrival, iSeats, countryCode);
                    manager.addFlight(international);
                    System.out.println("International flight added.");
                    break;

                case 3:
                    System.out.print("Enter Flight ID to book: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter number of seats to book: ");
                    int bookSeats = sc.nextInt();
                    boolean booked = manager.bookFlight(bookId, bookSeats);
                    System.out.println(booked ? "Booking successful!" : "❌ Booking failed or not enough seats.");
                    break;

                case 4:
                    System.out.print("Enter Start Time (HH:MM): ");
                    LocalTime start = LocalTime.parse(sc.next());
                    System.out.print("Enter End Time (HH:MM): ");
                    LocalTime end = LocalTime.parse(sc.next());

                    List<Flight> availableFlights = manager.getAvailableFlights(start, end);
                    if (availableFlights.isEmpty()) {
                        System.out.println("No available flights in this time range.");
                    } else {
                        System.out.println("Available Flights:");
                        for (Flight f : availableFlights) {
                            System.out.println(f.getFlightInfo());
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Flight Schedule System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
