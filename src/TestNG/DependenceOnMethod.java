package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceOnMethod {
	@Test(priority=1)
	public void login() {
		System.out.println("login the Application");
	}
	
	@Test(priority=2,dependsOnMethods="login")
	public void searchproduct() {
		System.out.println("product found");
	}
	@Test(priority=3,dependsOnMethods="searchproduct")
	public void addToCart()
	{	Assert.fail();
		System.out.println("product added to cart");
	}
	@Test(priority=4,dependsOnMethods="addToCart")
	public void payment() {
		System.out.println("product paid");
	}
	@Test(priority=4,dependsOnMethods="addToCart")
	public void logout() {
		System.out.println("logout from the Application");
	}
}
