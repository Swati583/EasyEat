package BasicScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PomRepository.HomePage;
import PomRepository.LoginPage;
import TestNG.BaseClass;

public class ToVerifyHomePageTitleTest extends BaseClass{
	@Test
	public void toVerifyHomePageTitleTest() {
		
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	String actualHomePageTitle = driver.getTitle();
	
	
	Assert.assertTrue(actualHomePageTitle.contains("Enter"));
		
	}
	
	
	
}