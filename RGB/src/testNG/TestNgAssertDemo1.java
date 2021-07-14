package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNgAssertDemo1 {
@Test
public void funA () {
	System.out.println(" funA of  TestNgAssertDemo1");
	Assert.assertTrue(true);
}
@Test
public void funB () {
	System.out.println(" funB of  TestNgAssertDemo1");
	Assert.assertTrue(false);
}
@Test
public void funC () {
	System.out.println(" funC of  TestNgAssertDemo1");
	Assert.assertFalse(false);
}
@Test
public void funD () {
	System.out.println(" funD of  TestNgAssertDemo1");
	Assert.assertFalse(true);
}
}