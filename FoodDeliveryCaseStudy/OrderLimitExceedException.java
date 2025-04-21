package FoodDeliveryCaseStudy;

@SuppressWarnings("serial")
public class OrderLimitExceedException extends Exception {
	public static String message ="OrderLimitExceedException";
	public OrderLimitExceedException() {
		super(message);
	}
}
