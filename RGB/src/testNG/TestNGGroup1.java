package testNG;

import org.testng.annotations.Test;

import execptionDemo.Execption;

public class TestNGGroup1 {
	@Test(groups="Sanity")
	public void funA() {
		System.out.println("funA of TestNGDemo2");

	}
		@Test(groups="Sanity")
	public void funB() {
	System.out.println("funB of TestNGDemo2");
	}
		@Test(groups="Regression")
		public void funC() {
			System.out.println("funC of TestNGDemo2");
	}
		@Test(groups="Regression")
		public void funD()throws Execption {
			 System.out.println("funD of TestNGDemo2");
		throw new Execption ();
		}

		@Test(dependsOnMethods ="Regression")
		public void funE() {
			System.out.println("funE of TestNGDemo3");
		}
				
		
}
