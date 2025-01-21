package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Priority {
	@Test(dependsOnMethods=("cs_jspider"))
	public void cs_qspider() {
		System.out.println("Testing");
	}

	@Test(priority = 2)
	public void cs_jspider() {
		System.out.println("Development");
	}
@org.testng.annotations.Parameters({"URL"})
	@Test(priority = 3)
	public void cs_spyspider(String URLname) {
		System.out.println("python");
		System.out.println(URLname);

	}

	@Test(priority = 1)
	public void spider() {
		System.out.println("spider institute");
	}

	@BeforeClass
	public void first() {
		System.out.println(" i will exicute first");
	}

	@AfterClass
	public void last() {
		System.out.println(" i will exicute last");
	}
	@BeforeMethod
	public void hello() {
		System.out.println(" Hello to all");
	}

	@AfterMethod
	public void bye() {
		System.out.println(" bye to all");
	}
}