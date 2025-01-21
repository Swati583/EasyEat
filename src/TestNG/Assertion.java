package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void hardAssert() {
		String actualResult ="Qspider";
		String expectedResult="Qspider";
		
		Assert.assertEquals(actualResult,expectedResult);
		System.out.println("The line after hard Assert");
	}
	@Test
	public void hardAssert2() {
		String actualResult ="Qspider";
		String expectedResult="Jspider";
		
		Assert.assertEquals(actualResult,expectedResult);
		System.out.println("The line after hard Assert");
	}
	
	@Test
public void hardAssert3() {
	String actualResult ="Qspider";
	String expectedResult="spider";
	
	Assert.assertTrue(actualResult.contains(expectedResult));
	System.out.println("The line after hard Assert");
}
}