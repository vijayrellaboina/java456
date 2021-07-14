package testNG;


import org.testng.annotations.Test;
public class TestNGDemo3 {

	public static void main(String[] args) {
		
	}
	@Test(priority = -1)
public void funA() {
	System.out.println("funA of TestNGDemo2");

}
	@Test(priority = -2)
public void funB() {
System.out.println("funB of TestNGDemo2");
}
	@Test(priority = 1)
	public void funC() {
		System.out.println("funC of TestNGDemo2");
}
	@Test(priority = 0)
	public void funD() {
		System.out.println("funD of TestNGDemo2");
	}

	}


