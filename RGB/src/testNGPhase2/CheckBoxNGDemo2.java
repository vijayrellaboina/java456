package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBoxNGDemo2 {
@Test
public void checkSelected() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ;
driver.get("https://www.calculator.net/mortgage-calculator.html");
}
@Test
public void selected() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ;
driver.get("https://www.calculator.net/mortgage-calculator.html");
boolean selected= driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
Assert.assertTrue(selected);

}
}