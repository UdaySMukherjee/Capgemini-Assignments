package CaseStudy1;

public class Professor extends Person{
	private String specialization;
	
	Professor(String name, int age, String specialization){
		super(name, age);
		this.specialization = specialization;
	}
	
	public String getSpecialization() {
		return this.specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public void displayProfessorInfo() {
		System.out.println("[Professor profile!");
		super.displayInfo();
		System.out.println("specialization: "+this.specialization+"]");
		System.out.println();
	}
	
}
