import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo1 {
	public static void main(String[] args)
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("https://in.yahoo.com/");
	//xpath=//*[contains(@type,'sub')]
	//driver.findElement(By.xpath("//*[contains(@class,'1nv09')]")).sendKeys("hello");
	//xpath using or& And:-//*[@type='submit' and/or @name='btn']
	//driver.findElement(By.xpath("//input[@id='ybar-sbq' and @name='p']")).sendKeys("hello");
	//driver.findElement(By.xpath("//input[@id='ybar-search' or @type='sub']")).click();
	driver.findElement(By.cssSelector("input._yb_1nv09[id=ybar-sbq]")).sendKeys("hello");
	// xpathtext() function
	////a[text()='Sign in']
	//a[contains(text(),'Sign in')] using contains in text
	//driver.findElement(By.id("identifierId")).sendKeys( "vijay678vijay678@gmail.com");
	//driver.findElement(By.name("identifier")).sendKeys("vijay");
//	driver.findElement(By.className("whsOnd")).sendKeys("vijay1");
//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("vijay1");
	//driver.findElement(By.xpath("//*[@id=\'identifierId']")).sendKeys("vijay1");
	//driver.findElement(By.linkText("Learn more")).click();
	//driver.findElement(By.partialLinkText("Learn")).click();
	//driver.findElement(By.partialLinkText("Sign")).click();
	//System.out.println("Done");
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\madasuvamsi\\Desktop\\IEDriverServer.exe" );
	//InternetExplorerDriver ieDriver  = new InternetExplorerDriver();
	//ieDriver.get("http://gmail.com");
	
	
	}
	

}
