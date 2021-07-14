import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2 {
@Test
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	Select element = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
element.selectByValue("Frankfurt");
Select element1 = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
	element1.selectByIndex(3);                                                         
//	WebElement   dropDown = driver.findElement(By.xpath("//select[@name='toPort']"));
//	Select  selectDropDown= new  Select(dropDown);
//	selectDropDown.selectByVisibleText("London");
//	Thread.sleep(4000);
//	selectDropDown.selectByIndex(8);
//	Thread.sleep(4000);
//	selectDropDown.selectByValue("Seattle");
	}
}
