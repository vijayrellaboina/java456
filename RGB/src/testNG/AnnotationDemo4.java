package testNG;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationDemo4 
{
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("funA of  beforeSuite");
	  }
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("funA of  beforeTest");
	}
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("funA  of  beforeClass");
	  }
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("funA of  beforeMethod");
	
	 }
	
	
		  
}
