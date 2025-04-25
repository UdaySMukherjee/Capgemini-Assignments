package CSVHandling;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class WriteDataAsCsv {
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		Employee emp = new Employee("Ratul", 27, 95000);
		
		FileWriter fr = new FileWriter("C:\\Users\\User\\Desktop\\Myfile\\CSV\\output.csv");
		StatefulBeanToCsv<Employee> b = new StatefulBeanToCsvBuilder(fr).build();
		b.write(emp);
		fr.flush();
		
		System.out.println("Data written!");
		
		
	}

}
