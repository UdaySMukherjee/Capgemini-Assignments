package FoodDeliveryCaseStudy;

@SuppressWarnings("serial")
public class MenuItemNotFoundException extends Exception{
	public static String message = "MenuItemNotFoundException";
	public MenuItemNotFoundException() {
		super(message);
	}
}
