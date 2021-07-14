package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
  @Test
  public void funA() {
	  System.out.println("funa of  Annotation1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("funA of  beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("funA of  afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("funA  of  beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("funA of  afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("funA of  beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("funA of  afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("funA of  beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("funA of  afterSuite");
  }

}
