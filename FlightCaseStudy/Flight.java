package FlightCaseStudy;

import java.time.LocalTime;

abstract public class Flight {
    private int flightId;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private int availableSeats;

    Flight(int flightId, LocalTime departureTime, LocalTime arrivalTime, int availableSeats) {
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
    }

    public boolean bookSeats(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return availableSeats > 0;
    }

    public String getFlightInfo() {
        return "Flight ID: " + flightId +
               ", Departure: " + departureTime +
               ", Arrival: " + arrivalTime +
               ", Available Seats: " + availableSeats;
    }

    public int getFlightId() {
        return flightId;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
