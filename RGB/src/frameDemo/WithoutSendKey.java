package frameDemo;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class WithoutSendKey {

	
	
	@Test
	
	public void sendkeys() 
	{
	
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
       
        myExecutor.executeScript("document.getElementsByName('email')[0].value='vijay678'");
       
        myExecutor.executeScript("document.getElementsByName('pass')[0].value='vijay14040'");
        
		//myExecutor.executeScript("document.getElementsByName('email')[0].value='vijay678'");
		
	}
}
