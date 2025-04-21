package FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	
	static List<Customer> customerList = new ArrayList<>();
	static List<Resturent> resList = new ArrayList<>();
	static List<Order> ordList = new ArrayList<>();
	
	
	public static void main(String[] args) {
	
		ordList.add(new Order("Rice"));
		ordList.add(new Order("Curry"));
		ordList.add(new Order("Curd"));
		ordList.add(new Order("Cake"));
		ordList.add(new Order("Biriyani"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("............WelCome To our food delivery app............");
			System.out.println(" 1. Add customer\n 2. Add Restaurant\n 3. Order food\n 4. Show order history of specific customer\n 5. Show order history of specific Restaurant\n 6. Reset order limit for specific customer\n");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch) {
				case 1:{
					int id = customerList.size()+1;
					System.out.println("Enter name:");
					String name = sc.nextLine();
					System.out.println("Enter password:");
					String pass = sc.nextLine();
					Customer cus = new Customer(id, name, pass);
					addCustomer(cus);
					System.out.println("Customer created successfully!");
					break;
				}
				case 2:{
					int id = resList.size()+1;
					System.out.println("Enter name:");
					String name = sc.nextLine();
					Resturent res = new Resturent(id, name);
					addResturent(res);
					System.out.println("Restaurant created successfully!");
					break;
				}
				case 3:{
					System.out.println("Select food:");
					for(int i=0;i<ordList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+ordList.get(i));
					}
					int select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=ordList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Order ord = ordList.get(select-1);
					if(customerList.size()==0) {
						System.out.println("Add customer first!!");
						break;
					}
					System.out.println("Select customer:");
					for(int i=0;i<customerList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+customerList.get(i).getName());
					}
					select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=customerList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Customer cus = customerList.get(select-1);
					System.out.println("Enter password:");
					String pass = sc.nextLine();
					if(!cus.login(pass)) {
						break;
					}
					if(resList.size()==0) {
						System.out.println("Add Restaurant first!!");
						break;
					}
					System.out.println("Select Restaurant:");
					for(int i=0;i<resList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+resList.get(i).getName());
					}
					select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=resList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Resturent res = resList.get(select-1);
					orderMenu(cus, res, ord);
					break;
				}
				case 4:{
					if(customerList.size()==0) {
						System.out.println("Add customer first!!");
						break;
					}
					System.out.println("Select customer:");
					for(int i=0;i<customerList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+customerList.get(i).getName());
					}
					int select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=customerList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Customer cus = customerList.get(select-1);
					System.out.println("Enter password:");
					String pass = sc.nextLine();
					if(!cus.login(pass)) {
						break;
					}
					cus.getOrder();
					break;
				}
				case 5:{
					if(resList.size()==0) {
						System.out.println("Add Restaurant first!!");
						break;
					}
					System.out.println("Select Restaurant:");
					for(int i=0;i<resList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+resList.get(i).getName());
					}
					int select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=resList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Resturent res = resList.get(select-1);
					res.getCustomer();
					break;
				}
				case 6:{
					if(customerList.size()==0) {
						System.out.println("Add customer first!!");
						break;
					}
					System.out.println("Select customer:");
					for(int i=0;i<customerList.size();i++) {
						System.out.print(" ");
						System.out.println((i+1)+". "+customerList.get(i).getName());
					}
					int select = sc.nextInt();
					sc.nextLine();
					if(select-1<0 || select-1>=customerList.size()) {
						System.out.println("Invalid Input!");
						break;
					}
					Customer cus = customerList.get(select-1);
					System.out.println("Enter password:");
					String pass = sc.nextLine();
					if(!cus.login(pass)) {
						break;
					}
					cus.resetsize();
					break;
				}
				default:{
					sc.close();
					System.out.println("Thank you!!");
					System.exit(0);
				}
			}
		}
		
	}
	
	
	// custom functions
	public static void addCustomer(Customer cus) {
		customerList.add(cus);
	}
	
	public static void addResturent(Resturent res) {
		resList.add(res);
	}
	
	public static void orderMenu(Customer cus, Resturent res, Order ord) {
		cus.setOrder(ord, res);
		res.setCustomer(cus, ord);
	}

}
