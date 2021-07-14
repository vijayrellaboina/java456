package ioDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputDemo1 {
	
	public static void main(String[] args) throws IOException {

		FileOutputStream outs= new FileOutputStream ("C:\\Users\\madasuvamsi\\Desktop\\ioDemo\\text1.txt");
//FileInputStream inputs = new FileInputStream(" C:\\Users\\madasuvamsi\\Desktop\\ioDemo\\text2.txt");
	File abc = new File("C:\\Users\\madasuvamsi\\Desktop\\ioDemo\\text3.txt");

	abc.createNewFile();
	 
	File file1 = new File("C:\\Users\\madasuvamsi\\Desktop\\ioDemo\\vijay");
	file1.mkdir();
	
	
	File file2 = new File("C:\\Users\\madasuvamsi\\Desktop\\ioDemo\\A\\B\\C");
	file2.mkdirs();
	System.out.println("Done");
	}
}