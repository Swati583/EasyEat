package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByContains {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String paragraph = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust')]")).getText();
		//System.out.println(paragraph);
		if(paragraph.contains("Selenium WebDriver"))
		{
		System.out.println("pass:selenium webdriver is present");
		
	}
	else
	
		System.out.println("fail:selenium webdriver is not present");
}
}
