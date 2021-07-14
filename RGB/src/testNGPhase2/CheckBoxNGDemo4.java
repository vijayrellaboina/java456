package testNGPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBoxNGDemo4 {
@Test
public void check1() {
	System.setProperty(" webdriver.chrome.driver" ,System.getProperty("user.dir")+"chromedriver.exe");
	ChromeDriver driver =new  ChromeDriver() ;
	driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	
	boolean display= driver.findElement(By.xpath("//*[@id=\'ContentHolder_lbFeatures_TG_D\']")).isDisplayed();
	
	boolean enable= driver.findElement(By.xpath("//*[@id=\'ContentHolder_lbFeatures_TG_D\']")).isEnabled();
	
	Assert.assertTrue(display);
	Assert.assertTrue(enable);
	

}
}
