import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {

	public static void main(String[] args) 
	{
		System.setProperty(" webdriver.chrome.driver" ,"C:\\Users\\madasuvamsi\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver() ;
	driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	//*[@id="ContentHolder_lbFeatures_TG_D"]
	boolean display= driver.findElement(By.xpath("//*[@id=\"ContentHolder_lbFeatures_TG_D\"]")).isDisplayed();
	
	boolean enable= driver.findElement(By.xpath("//*[@id=\"ContentHolder_lbFeatures_TG_D\"]")).isEnabled();
	
	boolean selected= driver.findElement(By.xpath("//*[@id=\"ContentHolder_lbFeatures_TG_D\"]")).isSelected();

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
	
	                                 
	}

}
