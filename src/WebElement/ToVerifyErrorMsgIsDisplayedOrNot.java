package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyErrorMsgIsDisplayedOrNot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("galat email id");
		
		Thread.sleep(5000);
		 
		boolean errormsg = driver.findElement(By.xpath("//p[text()='Email is invalid or already taken']")).isDisplayed();
		
		if(errormsg)
		{
			System.out.println("pass:the error msg is Didplayed");
		}
		else
			System.out.println("fail:the error msg is not Didplayed");
	}

}



