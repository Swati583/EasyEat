package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	//How to execute same test script multiple time with same data?
	@Test(invocationCount =5)
	public void demo() {
		System.out.println("Hello");
	}

}
