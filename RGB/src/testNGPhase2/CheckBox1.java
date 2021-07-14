package testNGPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox1 {
WebDriver driver;
	
	String checkBox1Path="//input[@value='Business']";
	
	public  CheckBox1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madasuvamsi\\eclipse-workspace\\Selenium class\\RGB\\Weddriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	     
	}
	     @Test(priority = 1)
	     public void checkBoxDisplay() {
	     boolean display= driver.findElement(By.xpath(checkBox1Path)).isDisplayed();
	     Assert.assertTrue(display);
	     }
	     
	     @Test(priority = 2)
	     public void checkBoxEnable() {
	     boolean enable= driver.findElement(By.xpath(checkBox1Path)).isEnabled();
	     Assert.assertTrue(enable);
	     }
	     
	     @Test(priority = 3)
	     public void checkBoxSelect() {
	     boolean select = driver.findElement(By.xpath(checkBox1Path)).isSelected();
	     Assert.assertFalse(select);	    
	     }
	     
	     @Test(priority = 4)
	     public void checkBoxClick()
	     {
	    	driver.findElement(By.xpath(checkBox1Path)).click();
	    	 
	     }
	     
	     @Test(priority = 5)
	     public void checkBoxDisplay1() {
	     boolean newSelect = driver.findElement(By.xpath(checkBox1Path)).isSelected();
	     Assert.assertTrue(newSelect);	
	     
	}
}
