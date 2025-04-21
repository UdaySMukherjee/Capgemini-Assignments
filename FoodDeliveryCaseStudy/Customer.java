package FoodDeliveryCaseStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer{
	private static boolean isLoggedIn = false;
	private String name;
	static List<String> orderList;
	
	
	Customer(boolean isLoggedIn, String name){
		Customer.isLoggedIn = isLoggedIn;
		this.setName(name);
		Customer.orderList = new ArrayList<>();
	}
	
	private static final List<String> menuItems = Arrays.asList(
	        "UncleChips", "Burger", "Rice", "Chowmein", "ChickenCurry", "VegMomo"
	    );

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void login() {
		isLoggedIn = true;
	}
	
	public static boolean isLoggedin() {
		return isLoggedIn;
	}
	
	public static void addFood(String item) throws MenuItemNotFoundException {
        if (!menuItems.contains(item)){
            throw new MenuItemNotFoundException();
        }
        orderList.add(item);
        System.out.println(item + " has been added to your order.");
    }
	
	public List<String> getOrderList() {
        return orderList;
    }
}
