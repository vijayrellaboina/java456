package testNG;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	@Test(priority = 0)
	public  void  loginTest()
			{
		System.out.println("loginTest  of  TestNGDemo4  ");
		System.out.println(0/0);
	}
			@Test(priority = 1,dependsOnMethods ="loginTest" )
			public void customerDetails() {
				System.out.println("customerDetails of  TestNGDEmo4");
				
				
}
			@Test(priority = 2, dependsOnMethods = "customerDetails")
			public void Fund() {
				System.out.println("sss");
			}
}