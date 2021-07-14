package seleniumPhase2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWindowDemo2 {
	@Test
	public void PopupWindowDemo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
	Set<String> winds =driver.getWindowHandles();
	Iterator<String>  winIdsList=winds.iterator();
	int totalWindows= winds.size();
	String ExpectedTitle= " Cognizant jobs- Career Opportunities in cognizant";
	
	for(int i=0;i<totalWindows;i++) 
	{
		driver.switchTo().window(winIdsList.next());
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
	
	
	driver.findElement(By.xpath("//*[@id=\'menu-item-43']/a/span[2]")).click();
	break;
}
}
	}
}