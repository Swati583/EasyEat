package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheErrorMsg {
	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg =  "Username or Password is invalid";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(5000);
		String actualErrorMsg = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		if(actualErrorMsg.contains(expectedErrorMsg))
		{
			System.out.println("pass:the error msg is verified");
		}
		else
			System.out.println("fail:the error msg is not verified");
			
			
	}

}
