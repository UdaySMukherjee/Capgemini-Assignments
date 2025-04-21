package FlightCaseStudy;

import java.time.LocalTime;

public class InternationalFlight extends Flight {
    private int countryCode;

    public InternationalFlight(int flightId, LocalTime departureTime, LocalTime arrivalTime, int availableSeats, int countryCode) {
        super(flightId, departureTime, arrivalTime, availableSeats);
        this.countryCode = countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }
}
