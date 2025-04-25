package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saveimage {
	public static void main(String[] args) throws IOException {
		String ImgPath = "C:\\Users\\User\\Downloads\\672434.jpg";
		
		Path p=Paths.get(ImgPath);
		byte[] byte_array = Files.readAllBytes(p);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Myfile\\newImage.jpg");
		fos.write(byte_array);
		
		System.out.println("Image saved!");
		
		
		
	}

}
