package frameDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo2 {

	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
//		ChromeDriver  driver =new  ChromeDriver() ;
//driver.get("https://www.facebook.com");
//
//TakesScreenshot ts= driver;
//File src=ts.getScreenshotAs(OutputType.FILE);
//File trg = new File(".\\Screenshot\\homepage.png");
//FileUtils.copyFile(src, trg);  

// for some portion
//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
//ChromeDriver  driver =new  ChromeDriver() ;
//driver.get("https://www.facebook.com");
//WebElement section =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]"));
//
//File src=section.getScreenshotAs(OutputType.FILE);
//File trg = new File(".\\Screenshot\\content.png");
//FileUtils.copyFile(src, trg); 
		
		
		//for logo
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
		ChromeDriver  driver =new  ChromeDriver() ;
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg= new File(".\\Screenshot\\Logo.png");
		FileUtils.copyFile(src, trg);;
	}

}
