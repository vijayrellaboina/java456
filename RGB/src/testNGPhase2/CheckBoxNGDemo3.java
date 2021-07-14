package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBoxNGDemo3  {

@Test
public void  new1() {
	
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ; 
driver.get("https://www.calculator.net/mortgage-calculator.html");
}
@Test
public void newSelected2() {
	
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ; 
driver.get("https://www.calculator.net/mortgage-calculator.html");

driver.findElement(By.xpath("//*[@id='caddoptional']")).click();

boolean newselected= driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
Assert.assertTrue(newselected);


}
}