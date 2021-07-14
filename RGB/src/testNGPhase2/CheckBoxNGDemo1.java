package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBoxNGDemo1 {
@Test
public void check() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ;
driver.get("https://www.calculator.net/mortgage-calculator.html");
	boolean display= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isDisplayed();
	
	boolean enable= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isEnabled();
	
	Assert.assertTrue(display);
Assert.assertTrue(enable);

}
}
