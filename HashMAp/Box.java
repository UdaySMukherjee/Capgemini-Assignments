package Generics;

public class Box<T> {
	T num1;
	T num2;
	
	Box(T num1, T num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(10, 20);
		System.out.println(b1.num1 + b1.num2); // We need to create object to apply operation on generic variables.
		// Box<Object> b2 = b1; -> it is not possible
		// Box<Number> b2 = b1; -> it is not possible
		// Box<Integer> b2 = b1; -> it is possible only
		// Box<?> b2 = b1; -> it is possible
		// Box<? extends Number> b2 = b1; -> it is possible as b1 is integer
		// Box<? extends Object> b2 = b1; -> it is possible as b1 is integer
		// Box<? super Number> b2 = b1; -> it is not possible as b1 is integer
		// Box<? extends Double> b2 = b1; -> it is possible as b1 is integer
		
	}
}

