import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
//WebElement   dropDown= driver.findElement(By.xpath("//select[@name='toMonth']"));
//Select  selectDropDown= new  Select (dropDown);
//selectDropDown.selectByVisibleText("June");
//Thread.sleep(4000);
//selectDropDown.selectByIndex(7);
//System.out.println("Done");
//Thread.sleep(4000);
//selectDropDown.selectByValue("12");
//System.out.println("Done");

WebElement   dropDown= driver.findElement(By.xpath("//select[@name='toPort']"));
Select  selectDropDown= new  Select(dropDown);
//selectDropDown.selectByVisibleText("London");
//Thread.sleep(4000);
//selectDropDown.selectByIndex(6);
//Thread.sleep(4000);
selectDropDown.selectByValue("Seattle");
	}

}
