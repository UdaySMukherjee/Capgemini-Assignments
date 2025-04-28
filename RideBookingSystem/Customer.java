package RideBookingSystem;

public class Customer extends User{

	Customer(String id, String name) {
		super(id, name);
	}

	@Override
	void showProfile() {
		System.out.println("Customer name: "+name);
	}

}
