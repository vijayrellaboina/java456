package seleniumPhase2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class CloseAndQuite {
	
	@Test
 public void close() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("http://demo.guru99.com/test/newtours/index.php");
	    driver1.quit();
	   
	   
	    
 }
}
