import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	boolean display= driver.findElement(By.xpath("//*[@value='oneway']")).isDisplayed();
	
	boolean enable= driver.findElement(By.xpath("//*[@value='oneway']")).isEnabled();
	boolean selected=driver.findElement(By.xpath("//*[@value='oneway']")).isSelected();
	if(display==true) {
		System.out.println("RadioButton is Displaying");
	}
	if(enable==true) 
	{
		System.out.println("RadioButton is enable");
	}
	 else {
		  System.out.println("RadioButton is not enable");
	}
	 if (selected==true) {
		  System.out.println("RadioButton is selected");
	  }                                                                  
	  else {
		  System.out.println("RadioButton is not selected");
		  }
	driver.findElement(By.xpath("//*[@value='oneway']")).click();
	boolean newselected=driver.findElement(By.xpath("//*[@value='oneway']")).isSelected();
	 if (newselected==true) {
		  System.out.println("RadioButton is selected");
	  }                                                                  
	  else {
		  System.out.println("RadioButton is not selected");
	  }
	}
}

	
	

	
	


