package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericFunctions1 {

	  public WebDriver driver;
	public void openBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");;
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.id.driver", "C:\\Users\\madasuvamsi\\Desktop\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
	}
	
	
	public void enterURL(String URL)
	{
		driver.get(URL);
	}
	
	public void enterData(String locatorType,String locatorValue,String data)
	{
		if(locatorType.equals("ID"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
	}
		public void click(String locatorType,String locatorValue)
		{
			if(locatorType.equals("ID"))
			{
				driver.findElement(By.id(locatorValue)).click();
			}
			else if(locatorType.equals("name"))
			{
				driver.findElement(By.name(locatorValue)).click();
			}
			else if(locatorType.equals("xpath"))
			{
				driver.findElement(By.xpath(locatorValue)).click();
			}
			}
}
