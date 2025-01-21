package TestNG;

import org.testng.annotations.Test;

public class ToCreateCustomer extends BaseClass{
	
	@Test
	public void createCustomer()
	{
		System.out.println("customer is created");
	}
	@Test
	public void customerProduct()
	{
		System.out.println("customer product is created");
	
	}
}
