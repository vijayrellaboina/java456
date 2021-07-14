package inputOutputDem01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\ConfigProperties\\Test2.Properties");
		
Properties p2 = new Properties();
p2.load(file);

String data1=  (String) p2.get("openBrowser");
System.out.println(data1);

String data2=  (String) p2.get("enterURL");
System.out.println(data2);

String data3=  (String) p2.get("enterData");
System.out.println(data3);

String data4=  (String) p2.get("xpath");
System.out.println(data4);

}
}