import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalRadioButton1 {

	
		public static void main(String[] args)
		{
			System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	

	List<WebElement> radioButtonList= driver.findElements(By.xpath("//input[@type='radio']"));
	int list = radioButtonList.size();
	System.out.println(list);
	}

}
