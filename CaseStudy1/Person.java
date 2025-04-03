package CaseStudy1;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}

}
