package testNGPhase2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WebTableNGDemo1 {
@Test
	public void text() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"\\webdriver\\chromedriver.exe");
	WebDriver  driver =new  ChromeDriver() ;
driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
List <WebElement>    rowsList=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
int rowcount= rowsList.size();

List <WebElement>    columnList=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
		int columncount  = columnList.size();

String xpath1 =" //*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		String xpath2 ="]/td[";
		String  xpath3 ="]";
				
				for(int i=1;i<=rowcount;i++) 
				{
					
					for(int j=1;j<=columncount; j++) 
					{
						String text=driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
						System.out.println("text :" + text);
					}
		
	}
}
}