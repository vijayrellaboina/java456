package frameDemo;



import org.testng.annotations.Test;

//import net.bytebuddy.description.type.TypeDescription.Generic;

public class LoginTest 
{
   @Test
   
public void loginTest1()
{
	
	
	GenericFunctions1  key = new GenericFunctions1();
	key.openBrowser("Chrome");
	key.enterURL("https://gmail.com");
	
    key.enterData("ID", "identifierId", "vijay");
    key.click("xpath", "//*[@id='identifierNext']/div/button/div[2]");
  
}
}