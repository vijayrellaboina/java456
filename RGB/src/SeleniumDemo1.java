import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1
{

	public static void main(String[] args)
	{                                                

     	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("document.getElementByID('userName').value='Abha_Rathour'");
		
		JS.executeScript("document.getElementByName('Password').value='password123'");
		
		
	}

}
