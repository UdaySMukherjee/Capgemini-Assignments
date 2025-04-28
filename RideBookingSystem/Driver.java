package RideBookingSystem;

public class Driver extends User{
	private boolean available = true;

	Driver(String id, String name) {
		super(id, name);
	}

	@Override
	void showProfile() {
		System.out.println("Driver name: "+name+"\n Availability: "+available);
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
