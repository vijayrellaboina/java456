package seleniumPhase2;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class PopUpBDemo1 {
@Test
public  void PopUpDemo1(){
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
	Set<String> winIds =driver.getWindowHandles();
	Iterator<String>  winIdsList=winIds.iterator();
	String parentWinID = winIdsList.next();
	String child1WinID= winIdsList.next();
	String child2WinID= winIdsList.next();
	String child3WinID= winIdsList.next();
	String child4WinID= winIdsList.next();
	
	driver.switchTo().window(child1WinID);
	
	driver.findElement(By.xpath("//*[@id=\'menu-item-43']/a/span[2]")).click();
	driver.quit();
}
}
