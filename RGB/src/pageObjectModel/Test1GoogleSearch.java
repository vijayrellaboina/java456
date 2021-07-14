package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSerachPage;


public class  Test1GoogleSearch {
 static WebDriver driver=null;
	
	public static void main(String[]args) {
		
		
		
	}
	public static void googleSearch() {
		
		System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		GoogleSerachPage.textbox_serach(driver).sendKeys("Automation step bt step");
		
		//driver.findElement(By.name("q")).sendKeys("Automatoion search step by step");
		//driver.findElement(By.name("bntk")).sendKeys(Keys.RETURN);
		
		GoogleSerachPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//driver.close();
	}
}

