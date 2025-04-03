package CaseStudy1;

import java.util.Arrays;

public class University {
	private String UniversityName;
	private Person[] people;
	
	public University(String UniversityName) {
		this.UniversityName = UniversityName;
		this.people = null;
	}
	
	public String getUniversityName() {
		return this.UniversityName;
	}
	
	public void addPerson(Person p) {
		if(this.people == null) {
			this.people = new Person[1];
			this.people[0] = p;
		}
		else {
			int size = this.people.length;
			Person[] tempPeople = Arrays.copyOf(this.people, size+1);
			tempPeople[size] = p;
			this.people = tempPeople;
		}
		
	}
	
	public void showPeople() {
		if(this.people == null) {
			System.out.println("First add some members!");
		}
		else {
			for(Person p: this.people) {
				if(p instanceof Student) {
					Student s = (Student)p;
					s.displayStudentInfo();
				}
				else {
					Professor prof = (Professor)p;
					prof.displayProfessorInfo();
				}
			}
		}
		
	}

}
