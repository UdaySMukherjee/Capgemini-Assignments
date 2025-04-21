package FoodDeliveryApp;

public class MyloginException extends Exception {
	private static String msg = "Invalid credentials!";
	
	public MyloginException() {
		super(msg);
	}
}
