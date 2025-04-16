package EmployeeManagementSystem;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee ID: ("+this.getId()+") Name: "+this.getName()+" salary: "+this.getSalary();
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}
	
	

}
