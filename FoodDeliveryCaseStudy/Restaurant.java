package FoodDeliveryCaseStudy;

public class Restaurant{
	
	private String name;
	
	public Restaurant(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void showMenu() {
        System.out.println("\t\tMenu Card\t\t");
        System.out.println("\t1.\tUncle Chips\t10Rs");
        System.out.println("\t2.\tBurger\t100Rs");
        System.out.println("\t3.\tRice\t50Rs");
        System.out.println("\t4.\tChowmein\t80Rs");
        System.out.println("\t5.\tChicken Curry\t120Rs");
        System.out.println("\t6.\tVeg Momo\t100Rs");
    }
	
}
