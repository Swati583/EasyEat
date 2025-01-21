package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupExecution {
	@Test(groups ="smoke")
	public void signup() {
		System.out.println("The user has signed up");
	}
	@Test(groups ="smoke")
	public void login() {
		System.out.println("The user has loged in");
		
	}
	@Test(groups ="regression")
	public void compose()
	{
		System.out.println("The user has composed");
	}
	@Test(dataProvider="data")
	public void delete(String arr)
	{
		System.out.println("message has been deleted");
		System.out.println(arr);

	}
	@Test(groups ="smoke")
	public void signout()
	{
		System.out.println("The user has been sign out");
	}

	@BeforeSuite
	public void firstSuit() {
		System.out.println(" i will exicute first siut");
	}

	@AfterSuite
	public void lastSuit() {
		System.out.println(" i will exicute last suit");
	}
	@BeforeTest
	public void firstTest() {
		System.out.println(" i will exicute first Test");
	}

	@AfterTest
	public void lastTest() {
		System.out.println(" i will exicute last Test");
	}
	@org.testng.annotations.Parameters({"URL"})
	@Test
	public void check(String URLname) {
		
		System.out.println(URLname);
}
	@DataProvider
	public Object[][] data()
			{
			Object[][] arr = new Object[4][2];
			
			arr[0][0] = "Shambhu sir";
			arr[1][0] = "Priya mam";
			arr[2][0] = "vinay sir";
			arr[3][0] = "Akash sir";
			
			
			arr[0][1] = "core java";
			arr[1][1] = "Advance java";
			arr[2][1] = "manual Testing";
			arr[3][1] = "Selenium";
			
			return arr;
}
}