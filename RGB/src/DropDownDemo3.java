import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo3 {

	public static void main(String[] args)
	{System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
	WebDriver  driver =new  ChromeDriver() ;
driver.get("https://www.meghanabus.in/");

WebElement   dropDown= driver.findElement(By.xpath(""));
		

	}

}
