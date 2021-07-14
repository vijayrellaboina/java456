package testNG;

import org.testng.annotations.Test;

public class AnnotationDemo2 {
	@Test(priority = 1)
	public  void   funA()
	{
		System.out.println("funA of AnnotationDemo2 ");
}
	@Test(priority = 0)
	public  void   funB()
	{
		System.out.println("funB of AnnotationDemo2 ");
		}
}