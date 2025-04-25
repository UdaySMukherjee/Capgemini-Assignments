package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Employee e = (Employee) o.readObject();
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());
		
	}

}
