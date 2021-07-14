package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class AnnotationDemo3 {
	
	
	@AfterMethod
	  public void afterMethod() {
		  System.out.println("funA of  afterMethod");
	}
		  @AfterClass
		  public void afterClass() {
			  System.out.println("funA of  afterClass");
}
	@AfterTest
	  public void afterTest() {
		  System.out.println("funA of  afterTest");}
		  
		  @AfterSuite
		  public void afterSuite() {
			  System.out.println("funA of  afterSuite");
		  }
}
