package Annotation;

@MyAnnotation(value = 10 , value2 = "hello")
public class Driver {
	
	@MyAnnotation(value2 = "hello")
	int age;
	
	@MyAnnotation(value2 = "Hi")
	void mix() {
		
	}
	
	public static void main(String[] args) {
		
	}

}
