package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo5 {
	@Test
	public void funA() {
		System.out.println("funA of TestNGDemo2");

	}
		@Test
	public void funB() throws Exception {
	System.out.println("funB of TestNGDemo2");
	 throw  new Exception ("funB failed" );
	}
		@Test
		public void funC() {
			System.out.println("funC of TestNGDemo2");
			throw new SkipException("funC is skipping");
	}
		@Test(enabled=false)
		public void funD() {
			System.out.println("funD of TestNGDemo2");
		
}

}
