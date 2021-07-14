package seleniumPhase2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DynamicDemo1 {
@Test
	

	public void dynamicWindowTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    Thread.sleep(3000);
	//    driver.manage().window().maximize();
	    String ExpectedTitle = "find a Flight: Mercury Tours:";
	   
	    driver.findElement(By.xpath("(//a[@href='reservation.php'])[1]")).click();
	    String ActualTitle= driver.getTitle();
	    
	    System.out.println(ActualTitle);
	    //Assert.assertEquals(ExpectedTitle, ActualTitle);
	    
		
		
	}
}
