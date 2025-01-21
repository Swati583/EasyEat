 package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String homepageTitle = driver.getTitle();
		System.out.println("the homepage Title is:"+homepageTitle);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		String loginpageTitle = driver.getTitle();
		System.out.println("the loginpageTitle is:"+loginpageTitle);
		
	}

}
