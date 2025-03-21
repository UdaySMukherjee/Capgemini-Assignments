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
	
	public static void main(String[] args) {
		Employee p1 = new Employee("Gaurav Basu", 20000, 9876451229l);
		Employee p2 = new Employee("Ritika Roy", 23000, 9674652566l);
		
		System.out.println(p1.name+"\t"+p1.salary+"\t"+p1.phoneNo);
		System.out.println(p2.name+"\t"+p2.salary+"\t"+p2.phoneNo);
	}

}
