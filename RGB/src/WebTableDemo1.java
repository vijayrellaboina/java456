import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {
	public static void main(String[] args) {

		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
	driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	
	WebElement  firstcell= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody"));
String firstcellData = firstcell.getText();
	System.out.println(firstcellData);
	}

}