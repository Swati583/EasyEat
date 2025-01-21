package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPro {
	@Test
	public void demoAssertion()
	{
		String a = "Qspiders";
		String b= "Jspiders";
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(a,b);
		System.out.println("Line before");
		 sa.assertAll();
		System.out.println("Line 5");
		//sa.assertAll();
	}

}
