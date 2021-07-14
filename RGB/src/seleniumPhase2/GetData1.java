package seleniumPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GetData1 {
 @Test
	public void GetData1 () {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	    driver.get("https://www.meghanabus.in/manage-bookings.html");
	    
	      driver.findElement(By.xpath("//*[@id=\"manage_booking\"]/div[1]/div[1]/div[1]/span")).getText();
	
//	search.click();
//	    String str = driver.findElement(By.xpath("//*[@id=\\'ticketForm\\']/div[3]/div/button")).getText();
//	    System.out.println(str);
   driver.quit();
}
 
}
