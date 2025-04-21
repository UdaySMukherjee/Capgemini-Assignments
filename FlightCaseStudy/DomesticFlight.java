package FlightCaseStudy;

import java.time.LocalTime;

public class DomesticFlight extends Flight {
    private int stateCode;

    public DomesticFlight(int flightId, LocalTime departureTime, LocalTime arrivalTime, int availableSeats, int stateCode) {
        super(flightId, departureTime, arrivalTime, availableSeats);
        this.stateCode = stateCode;
    }

    public int getStateCode() {
        return stateCode;
    }
}
