package FoodDeliveryApp;

public class Order {
	private String orderName;
	
	public Order(String name) {
		this.setOrderName(name);
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	@Override
	public String toString() {
		return "Order Name: "+orderName;
	}
	
	
}
