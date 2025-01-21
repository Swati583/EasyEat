package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyStrongPasswordIsMadeOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-continue-to='password-container']")).click();
		
		Thread.sleep(2000);
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		if(passwordTextBox.isDisplayed())
		{
			System.out.println("pass:The password textfield is displayed");
		}
		else
			
			System.out.println("fail:The password textfield is not displayed");
		
		passwordTextBox.sendKeys("Swati@jaiswal00");
		
		Thread.sleep(2000);
		
		String passwordStrongMsg = driver.findElement(By.xpath("//p[contains(text(),'Password is')]")).getText();
		
		if(passwordStrongMsg.contains("strong"))
		{
			System.out.println("Pass: the password strong");
		}
		else
		
			System.out.println("fail: the password not strong");
		 
		Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@data-continue-to=\"username-container\"]")).click();
			
		
	}

}
