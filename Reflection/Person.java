package Reflection;

public class Person {
	
	private String name;
	private int age;
	
	private Person() {
		System.out.println("no arg cons");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getDetails(int age) {
		return name+"\t"+age;
	}
	
	private void task(String task) {
		System.out.println("Doing the task :"+task);
	}

}
