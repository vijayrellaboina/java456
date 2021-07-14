package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderTest1 {

	
	
	
	@Test(dataProvider = "setData")
	public void TestChrome(String username, String password) 
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);

	
	}
	@DataProvider
	public Object[][] setData()
	{
		
	Object [][] facebookdata=new Object[3][2];
	facebookdata[0][0]="vijay@gmail.com";
	 facebookdata[0][1]="vijay1";
	 facebookdata[1][0]="rgb@gmail.com";
	 facebookdata[1][1]="sai2";
	 facebookdata[2][0]="vakeelsab@gmail.com";
	 facebookdata[2][1]="powerstar";
	return facebookdata;
	
	}
}
