import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksDemo1 {
static WebDriver driver;


public LinksDemo1() {
	

	
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		  driver =new  ChromeDriver() ;
	driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
}
@Test
public void table() {
	List <WebElement>    linkList=driver.findElements(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]/a"));
	//String firstLinkName = linkList.get(0).getText();
	int  linkSize = linkList.size();
	System.out.println(linkSize);
	
	                          
	for(int i=0;i<linkSize-1;i++){
		String linksName=linkList.get(i).getText();
		System.out.println(linksName);
	}
	
	
	
	

	}

}
