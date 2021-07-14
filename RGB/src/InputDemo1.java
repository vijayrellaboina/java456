

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("http://facebook.com");
	//driver.findElement(By.id("identifierId")).sendKeys( "vijay678vijay678@gmail.com");
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("vijay1");
	  
//	boolean display= driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
//	
//	boolean enable= driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
	
	//boolean selected= driver.findElement(By.xpath("//*[@id=\"email\"]")).isSelected();
//	if (display==true)
//	{
//		System.out.println("element is displaying");
//	}
//	  if (enable==true) {
//		  System.out.println("element is   enabled");
//	  }
//	  else  {
//		  System.out.println("element is not displaying");
//	  }
//	  boolean selected= driver.findElement(By.xpath("//*[@id=\"email\"]")).isSelected();
//	    if (selected==true) {
//		  System.out.println("element is  selected");}
//		  
//		   else  {
//			  System.out.println("element is not selected");
//		  }
	
//		 String expectdWatermark="Email address or phone number";
//		 String actualData = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("placeholder");
//		 if(expectdWatermark.equals(actualData))
//		 {
//		 System.out.println("watermark is available");
//	}
//		 else {
//			 System.out.println("watermark is not availble");} 
// }
//	String EpectedEnteredData="vijay678";
//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(EpectedEnteredData);
//	String ActualEnteredData = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
//	
//if(EpectedEnteredData.equals(ActualEnteredData)) {
//	System.out.println("Expected result");
//} 
//else 
//{
//	System.out.println("expected result not");
//	
//}//*[@id="email"]
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[3]")).clear();
	}
}

