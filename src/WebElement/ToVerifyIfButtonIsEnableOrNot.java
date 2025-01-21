package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyIfButtonIsEnableOrNot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("jaiswalswati583@gmail.com");
		
		Thread.sleep(2000);
		
		boolean continueButtonStatus = driver.findElement(By.xpath("//button[@data-continue-to='password-container']")).isEnabled();
		
		if(continueButtonStatus)
		{
			System.out.println("pass:the button is enabled");
		}
		else
			System.out.println("fail:the button is not enabled");
	}

}
