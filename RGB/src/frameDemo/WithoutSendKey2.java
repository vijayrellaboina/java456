package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutSendKey2 {

	@Test
	public void sendKeys2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement place = driver.findElement(By.name("email"));
		JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
		myExecutor.executeScript("'vijay678'",place);
	//	myExecutor.executeScript("arguments[0].value='vijay678'",place);
		//driver.quit();
		
	}
}
