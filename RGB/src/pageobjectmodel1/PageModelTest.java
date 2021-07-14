package pageobjectmodel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageModelTest {

	@Test
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RegistrationPage1 RGPage= new RegistrationPage1(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demo.guru99.com/test/newtours/");

RGPage.clickRegLink();
RGPage.setFirstName("vijay");
RGPage.setLastName("sankar");
RGPage.setPhone("9291200569");
RGPage.setEmail("vijay@gmail.com");
RGPage.setAddress1("Nizampet");
RGPage.setcity("hyderabad");
RGPage.setState("Telangana");
RGPage.setPostalCode("522004");
RGPage.setCountry("India");
	RGPage.setUserNmae("vijayrv");
	RGPage.setPassword("vijay127");
	RGPage.setConfirmPassword("vijay127");
	
	
	
	}
	
}
