package testNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 {
	WebDriver driver;
	public WebTableDemo1 ()
	 {
		//*[@id="fontSize"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/a
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
	  driver =new  ChromeDriver() ;
	driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
	 }
	@Test
	public void checkTable() {
		//List <WebElement>    linkList=driver.findElements(By.tagName("a"));
//	WebElement  firstcell= driver.findElement(By.xpath("//*[@'id=fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td/a")).click();
//String firstcellData = firstcell.getText();
//	System.out.println(firstcellData);
//	List<WebElement> listrow= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
//	int rowcount=listrow.size();
//	List<WebElement> listrow1= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
//	int column= listrow1.size();
	
	}

}