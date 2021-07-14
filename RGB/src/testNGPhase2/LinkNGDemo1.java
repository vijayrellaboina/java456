package testNGPhase2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LinkNGDemo1 {
@Test
public void link() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"\\chromedriver.exe");
	WebDriver  driver =new  ChromeDriver() ;
driver.get("https://www.Cricbuzz.com/");


	
List <WebElement>    linkList=driver.findElements(By.tagName("a"));

int  linkSize = linkList.size();
System.out.println(linkSize);


for(int i=0;i<linkSize-1;i++){
	String linksName=linkList.get(i).getText();
	System.out.println(linksName);
}
}
}