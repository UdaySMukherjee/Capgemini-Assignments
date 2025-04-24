package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		/*
		File f = new File("C:\\Users\\User\\Desktop\\Myfile");
		boolean b = f.mkdir();
		System.out.println(b);		
		File f1 = new File("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		boolean a = f1.createNewFile();
		System.out.println(a);
		String[] list_of_files = f.list();
		System.out.println(Arrays.toString(list_of_files));
		
		FileWriter f2 = new FileWriter("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		f2.append("S");
		f2.write("\n");
		f2.append("hi");
		f2.write("\n");
		f2.write('a');
		f2.write("\n");
		f2.append("99");
		f2.flush(); // -> it pushes data to file from the byte stream
		System.out.println("Data written");
		
		FileReader f3 = new FileReader("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		int i = f3.read(); // it reads character by character
		while(i!=-1) {
			System.out.print((char) i);
			i=f3.read();
		}
		
		FileWriter f2 = new FileWriter("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		BufferedWriter b = new BufferedWriter(f2);
		b.write("hello");
		b.newLine();
		b.write(100);
		b.newLine();
		b.write(99);
		b.flush();
		System.out.println("Data written");
		
		*/
		
		FileReader f3 = new FileReader("C:\\Users\\User\\Desktop\\Myfile\\textFile.txt");
		BufferedReader b2 = new BufferedReader(f3);
		
		String line = b2.readLine();
		
		while(line != null) {
			System.out.println(line);
			line=b2.readLine();
		}
		
	}
}
