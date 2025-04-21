package FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private int customerId;
	private String password;
	private int size;
	private List<Order> orderList = new ArrayList<>();
	private List<Resturent> resList = new ArrayList<>();
	
	public Customer(int id, String name, String pass) {
		this.customerId = id;
		this.name = name;
		this.password = pass;
	}
	
	public int getId() {
		return this.customerId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getpass() {
		return this.password;
	}
	
	public void getOrder() {
		if(orderList.size()==0) {
			System.out.println("No order history!!");
			return;
		}
		System.out.println("The order List:");
		for(int i=0;i<resList.size();i++) {
			System.out.println(resList.get(i)+"->"+orderList.get(i));
			
		}
		System.out.println();
	}
	
	public void setOrder(Order order,Resturent restaurant) {
		try {
			if(size<=4) {
				orderList.add(order);
				resList.add(restaurant);
				size++;
				System.out.println("Order Done!");
			}else {
				throw new MyException();
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void resetsize() {
		this.size=0;
		System.out.println("Now, customer "+this.getName()+" can order upto 5 items.");
	}
	
	public boolean login(String pass) {
		try {
			if(this.getpass().equals(pass)) {
				return true;
			}
			else {
				throw new MyloginException();
			}
		}
		catch(MyloginException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "CustomerId: "+customerId+" Name: "+name;
	}
	
	

}
