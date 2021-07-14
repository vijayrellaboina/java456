package testNGPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo1 {
WebDriver driver;
	
	String xpath="(//input[@name='tripType'])[2]";
	
	public  RadioButtonDemo1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madasuvamsi\\eclipse-workspace\\Selenium class\\RGB\\Weddriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	     
	}
	     @Test(priority = 1)
	     public void RadioButtonDisplay() {
	     boolean display= driver.findElement(By.xpath(xpath)).isDisplayed();
	     Assert.assertTrue(display);
	     }
	     
	    @Test
	    public void RadioButtonEnabled() {
	    	boolean enable= driver.findElement(By.xpath(xpath)).isEnabled();
	    	Assert.assertTrue(enable);	     
	    	}
	     
	     @Test(priority = 3)
	     public void RadioButtonSelect() {
	     boolean select = driver.findElement(By.xpath(xpath)).isSelected();
	     Assert.assertFalse(select);	    
	     }
	     
	     @Test(priority = 4)
	     public void RadioButtonClick()
	     {
	    	driver.findElement(By.xpath(xpath)).click();
	    	 
	     }
	     
	     @Test(priority = 5)
	     public void RadioButtonDisplay1() {
	     boolean newSelect = driver.findElement(By.xpath(xpath)).isSelected();
	     Assert.assertTrue(newSelect);	
	     
}
}