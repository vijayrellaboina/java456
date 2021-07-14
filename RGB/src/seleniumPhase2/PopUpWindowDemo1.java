package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class PopUpWindowDemo1 {
@Test
	public void  verifyPopUPDemo() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-43\"]/a/span[2]")).click();
		
	}
}
