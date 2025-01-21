package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void hardAssert() {
		String actualResult ="Qspiders";
		String expectedResult="Jspiders";
	
		SoftAssert sa = new SoftAssert();
		
		Assert.assertEquals(actualResult,expectedResult);
		
		//checkpoint
		//sa.assertAll();
	
		System.out.println("The line after soft Assert");
	

}
}
