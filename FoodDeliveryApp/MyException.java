package FoodDeliveryApp;

public class MyException extends Exception {
	private static String msg = "Order limit reached!";
	
	public MyException() {
		super(msg);
	}
}
