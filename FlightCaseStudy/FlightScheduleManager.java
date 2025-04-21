package FlightCaseStudy;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightScheduleManager {
    private List<Flight> flights;

    public FlightScheduleManager() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean bookFlight(int flightId, int count) {
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId && flight.isAvailable()) {
                return flight.bookSeats(count);
            }
        }
        return false;
    }

    public List<Flight> getAvailableFlights(LocalTime start, LocalTime end) {
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.isAvailable() &&
                !flight.getDepartureTime().isBefore(start) &&
                !flight.getDepartureTime().isAfter(end)) {
                availableFlights.add(flight);
            }
        }
        return availableFlights;
    }
}
