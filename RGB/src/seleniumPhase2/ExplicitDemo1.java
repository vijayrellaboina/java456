package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class ExplicitDemo1 {
@Test
	public void explicit() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
    
    driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();
   // Thread.sleep(3000);
    
    WebDriverWait  wait= new WebDriverWait(driver, 30);
  
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentHolder_lbModels_10_D']")));
    driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']")).click();

    
    driver.quit();
    
}


}
