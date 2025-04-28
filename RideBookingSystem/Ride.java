package RideBookingSystem;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	Ride(Customer customer,Driver driver){
		this.customer = customer;
		this.driver = driver;
		this.status = "Booked";	
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getStatus() {
		return status;
	}

	public void completeRide(String status) {
		this.status = status;
		driver.setAvailable(true);
	}
	
	public String rideDetails() {
		return "Customer Name: "+customer.name+"\nDriver Name: "+driver.name+"\nCurrent Status"+getStatus();
	}
	
}
