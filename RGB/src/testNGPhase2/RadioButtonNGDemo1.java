package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RadioButtonNGDemo1 {
	
@Test
public void button() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ; 
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
boolean display= driver.findElement(By.xpath("//*[@value='oneway']")).isDisplayed();
	
	boolean enable= driver.findElement(By.xpath("//*[@value='oneway']")).isEnabled();
	Assert.assertTrue(display);
	Assert.assertTrue(enable);
	
}
}
