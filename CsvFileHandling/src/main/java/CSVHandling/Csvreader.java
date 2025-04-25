package CSVHandling;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Csvreader {
	public static void main(String[] args) throws CsvValidationException, IOException {
		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Myfile\\CSV\\abc.csv");
		CSVReader reader = new CSVReader(fr);
		
		String[] data = reader.readNext();
		
		while(data != null) {
			for(String str: data) {
				System.out.print(str+"\t");
			}
			System.out.println();
			data=reader.readNext();
		}
		
		
	}
}
