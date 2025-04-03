package CaseStudy1;

public class Student extends Person{
	private int StudentId;
	
	Student(String name, int age, int id){
		super(name, age);
		this.StudentId = id;
	}
	
	public int getStuId() {
		return this.StudentId;
	}
	
	public void setId(int id) {
		this.StudentId = id;
	}
	
	public void displayStudentInfo() {
		System.out.println("[Student profile!");
		super.displayInfo();
		System.out.println("StudentId: "+this.StudentId+"]");
		System.out.println();
	}
}
