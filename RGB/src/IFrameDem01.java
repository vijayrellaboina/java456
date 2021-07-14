import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDem01 {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		WebDriver  driver =new  ChromeDriver() ;
	driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	
	 String expectddata="Saturday, 3 January 2015";	
	 driver.switchTo().frame(0);
	 String ActualData=driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/h2/span")).getText();
	 System.out.println(ActualData);
	 if(ActualData.equals(expectddata)) {
		 System.out.println("expecteddata");
	 }
	 else {
		 System.out.println("expecteddata not found");
	 }
	 
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("Hyderabad");
	 String Text=	 driver.findElement(By.xpath("//*[@id=\"text1\"]")).getText();
	 System.out.println(Text);
	 
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("india");
	 String Text2=	 driver.findElement(By.xpath("//*[@id=\"text2\"]")).getText();
	 System.out.println(Text2);
	}

}

