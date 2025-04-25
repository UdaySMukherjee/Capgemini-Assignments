package CSVHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class ReadDataAsObject {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Myfile\\CSV\\abc.csv");
		CsvToBean<Employee> c = new CsvToBeanBuilder(fr).withType(Employee.class).build();
		List<Employee> list = c.parse();
		System.out.println(Arrays.toString(list.toArray()));
	}
	
}
