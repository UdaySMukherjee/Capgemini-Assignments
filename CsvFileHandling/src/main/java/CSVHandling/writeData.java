package CSVHandling;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class writeData {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\User\\Desktop\\Myfile\\CSV\\abc.csv");
		
		CSVWriter writer = new CSVWriter(f, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END);
		String[] header = {"Name","Age","Salary"};
		writer.writeNext(header);
		String[] data1 = {"raju","15","50000"};
		writer.writeNext(data1);
		String[] data2 = {"rohit","15","60000"};
		writer.writeNext(data2);
		
		writer.flush();
		System.out.println("data written!");
				
				
	}

}
