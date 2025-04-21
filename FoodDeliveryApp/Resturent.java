package FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Resturent {
	
	private String name;
	private int Id;
	private List<Customer> customerList = new ArrayList<>();
	private List<Order> orderList = new ArrayList<>();
	
	public Resturent(int id, String name) {
		this.Id = id;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.Id;
	}
	
	public void getCustomer() {
		if(orderList.size()==0) {
			System.out.println("No order history!!");
			return;
		}
		System.out.println("The customer List:");
		for(int i=0;i<customerList.size();i++) {
			System.out.println(customerList.get(i)+"->"+orderList.get(i));
			
		}
		System.out.println();
	}
	
	public void setCustomer(Customer customer, Order order) {
		customerList.add(customer);
		orderList.add(order);
	}
	
	@Override
	public String toString() {
		return "ResturentId: "+Id+" Resturent Name: "+name;
	}
}
