package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomRepository.HomePage;
import PomRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void bsConfig() {
	System.out.println("database connection established");
	}
	@BeforeTest
	public void btConfig() {
		System.out.println("parllel ececution is achieved");
	}
	@BeforeClass
	public void bcConfig()
	{	driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("browser is launched");
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("The URL has been navigated");
	}
	@BeforeMethod
	public void bmConfig() {
		LoginPage login = new LoginPage(driver); 
		login.LoginAction("admin","manager");
		System.out.println("loged in to the Application");
	}
	@AfterMethod
	public void amConfig() {
		HomePage home = new HomePage(driver);
		home.LogoutAction();
		System.out.println("logout from the Application");
	}
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("close the borwser");
		
	}
	@AfterTest
	public void atConfig() {
		
		System.out.println("Parllel execution stopped");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("DataBase connection is closed");
	}
	@Test
	public void demo()
	{
		System.out.println("compose");
	}
}
