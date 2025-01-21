package TestNG;

import org.testng.annotations.Test;

public class DisableTestScript {
	@Test
	public void qspider()
	{
		System.out.println("Testing");
	}
	@Test(enabled=false)
	public void jspider()
	{
		System.out.println("Development");	
	}
	@Test
	public void spyspider()
	{
		System.out.println("python");	
	}

}
