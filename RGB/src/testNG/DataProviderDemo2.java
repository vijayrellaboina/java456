package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
@Test (dataProvider = "setData")
public void loginTest(String userName, String password) 
{
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/index.php");
	
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys( userName);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys( password);
}
	@DataProvider 
	public Object[][] setData ()
	{
		
		Object [][] guru = new Object [4][2];
		guru[0][0]="vijay678vijay678@gmail.com";
		guru[0][1]="vijay678";
		guru[1][0]="vijay14040";
		guru[1][1]="741651";
		guru[2][0]="sunny";
		guru[2][1]="9030715";
		guru[3][0]="vamsi";
		guru[3][1]="9371133";
			
		return guru;
		
		
	
}
}
