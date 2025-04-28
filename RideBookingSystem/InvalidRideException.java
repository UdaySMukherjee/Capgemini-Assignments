package RideBookingSystem;

@SuppressWarnings("serial")
public class InvalidRideException extends RuntimeException{
	String message = "InvalidRideException";
	public InvalidRideException(String message) {
		super(message);
	}
}
