package CustomeAnnotation;

public class Task {
	
	@Role("User")
	public void userTask() {
		System.out.println("User Task");
	}
	
	@Role("Admin")
	public void adminTask() {
		System.out.println("Admin Task");
	}
	public static void main(String[] args) {
		System.out.println("Main");
	}

}
