import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ButtonDemo1 {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("http://facebook.com");
		boolean display= driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		
		boolean enable= driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		boolean selected= driver.findElement(By.xpath("//button[@name='login']")).isSelected();
		if (display==true)
		{
			System.out.println("element is displaying");
		}
		  if (enable==true) {
			  System.out.println("element is   enabled");
			  
			  
		  }
		  String expectedButtonName="Log In";
		  String ActualData=driver.findElement(By.xpath("//button[@name='login']")).getText();
		//  System.out.println(ActualData); String ActualData=driver.findElement(By.xpath("//button[@name='login']")).getText();
		  if(expectedButtonName.equals(ActualData)) {
			  System.out.println("Button is correct");
		  }
		  else {
			  System.out.println("button is not available");
		  }
		  
	}      

}
