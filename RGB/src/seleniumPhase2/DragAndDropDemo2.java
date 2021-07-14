package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class DragAndDropDemo2 {
@Test
public void  DragAndDropDemo2() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	
	Actions act = new   Actions(driver);

	act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='slider']")), 89,0 ).perform();
 driver.switchTo().defaultContent();
	String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/p")).getText();
System.out.println(text);
	
}
}
