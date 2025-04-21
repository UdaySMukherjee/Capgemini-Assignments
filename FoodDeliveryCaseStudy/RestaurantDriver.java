package FoodDeliveryCaseStudy;

import java.util.Scanner;

public class RestaurantDriver {
	public static void main(String[] args) throws OrderLimitExceedException {
		Restaurant restura = new Restaurant("Bhaskars Palace");
		Customer cust = null;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("\t\tWelcome to "+restura.getName()+"\t\t");
				System.out.println("Press 0 to logout and exit");
				System.out.println("Press 1 to login");
				System.out.println("Press 2 to show menu card");
				System.out.println("Press 3 to add items");
				System.out.println("Press 4 to place Order");
				System.out.println("Press 5 to show List");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 0:
					System.out.println("Exiting... Goodbye!");
					System.exit(0);
					break;
				case 2:
					Restaurant.showMenu();
					break;
				case 1:
					System.out.print("Enter Name: ");
					String name = sc.next();
					cust = new Customer(false, name);
					Customer.login();
					System.out.println("Logged in successfully as " + cust.getName());
					break;
				case 3:
					System.out.println("Enter the name of the item to add:");
			        String Itemname = sc.next();
			        if (Customer.isLoggedin()) {
			            if(Customer.orderList.size() >= 5) {
			                throw new OrderLimitExceedException();
			            }
			            try {
			    	        Customer.addFood(Itemname);
			    	        System.out.println(Itemname + " added to your order.");
			    	    } catch (MenuItemNotFoundException e) {
			    	        System.out.println(e.getMessage());
			    	    }
			        } else {
			            System.out.println("You need to log in first.");
			        }
			        break;
				case 4:
					if (Customer.orderList.size() > 0 && Customer.orderList.size() <= 5) {
			            System.out.println("Your order has been placed: ");
			            for (String item : Customer.orderList) {
			                System.out.println(item);
			            }
			            Customer.orderList.clear();
			        } else {
			            System.out.println("No items in the order.");
			        }
			        break;
				case 5:
					System.out.println("Items in your order:");
			        if (Customer.orderList.size() > 0 && Customer.orderList.size() <= 5) {
			            for (String item : Customer.orderList) {
			                System.out.println(item);
			            }
			        } else {
			            System.out.println("No items in the order.");
			        }
			        break;
			    default:
			        System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}

	
}
