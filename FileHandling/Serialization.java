package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		Employee e = new Employee(101, "Soham", 200000);
		o.writeObject(e);
		System.out.println("Employee saved to file!");
	}

}
