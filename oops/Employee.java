package oops;

public class Employee {
	String name;
	double salary;
	long phoneNo;
	
	Employee(String name, double salary, long phoneNo) {
		this.name = name;
		this.salary = salary;
		this.phoneNo = phoneNo;
	}
	
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	Employee(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee p1 = new Employee("Gaurav Basu", 20000, 9876451229l);
		Employee p2 = new Employee("Ritika Roy", 23000);
		Employee p3 = new Employee("Soham Das");
		
		System.out.println(p1.name+"\t"+p1.salary+"\t"+p1.phoneNo);
		System.out.println(p2.name+"\t"+p2.salary);
		System.out.println(p3.name);
	}

}
