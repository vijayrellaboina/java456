import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 {

	public static void main(String[] args) 
	 {
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("https://www.calculator.net/mortgage-calculator.html");
		boolean display= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isDisplayed();
		
		boolean enable= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isEnabled();
		
		boolean selected= driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
	
	
		if (display==true)
			
		{
			System.out.println("Checkbox is displaying");
		}
		  if (enable==true) 
		  {
			  System.out.println("Checkbox is   enabled");
			  }
		  else {
			  System.out.println("element is not displaying");
			  }
		  if (selected==true) {
				  System.out.println("checkbox is selected");
			  }                                                                  
			  else {
				  System.out.println("checkbox is not selected");
		  driver.findElement(By.xpath("//*[@id='caddoptional']")).click();
			boolean newselected= driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
		  if (newselected==true) 
		  {
			  System.out.println("checkbox is selected");
		  }                                                                  
		  else {
			  System.out.println("checkbox is not selected");
		  }


			  }
		
	}
}

