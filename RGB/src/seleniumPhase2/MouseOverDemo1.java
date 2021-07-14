package seleniumPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo1 {
@Test
public void MouseOverDemo1()
{  
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 driver.getTitle();
	WebElement   account = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]/span"));
	Actions act = new   Actions(driver);
	act.moveToElement(account).perform();

	WebElement   Computers= driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
	Actions com = new   Actions(driver);
	com.moveToElement(Computers).perform();
}
}
