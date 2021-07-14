import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinfElemntandElements {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
		driver.get("http://gmail.com");
//driver.findElement(By.xpath("//input"));
//System.out.println("Done");
driver.findElements(By.xpath("input"));
System.out.println("Done");
	}

}
