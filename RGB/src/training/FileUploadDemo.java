package training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo 
{
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty(" webdriver.chrome.driver","C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
	WebDriver driver =new  ChromeDriver() ;
	driver.get("C:\\Users\\madasuvamsi\\Desktop\\Notepad\\File.html");
WebElement choose=driver.findElement(By.xpath("//*[@id='RBGtech14']"));
//choose.sendKeys("C:\Users\madasuvamsi\Desktop\jira1.PNG");
//choose.submit();
Thread.sleep(10000); 
Runtime.getRuntime().exec("C:\\Users\\madasuvamsi\\Desktop\\FileDemo.exe");
System.out.println("Done");
}
	
}
