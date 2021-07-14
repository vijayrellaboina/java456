package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableNGDemo {
	@Test
	public void  path() {
		
	
	System.setProperty(" webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
	WebDriver  driver =new  ChromeDriver() ;
driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	
		
	
WebElement  firstcell= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody"));
String firstcellData = firstcell.getText();
System.out.println(firstcellData);
}
}
