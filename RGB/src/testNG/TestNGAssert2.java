package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssert2 {
@Test
public void funA () {
	System.out.println(" funA of  TestNgAssert2");
	Assert.assertTrue(true, " Test case pass");
}
}
