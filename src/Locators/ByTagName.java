package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByTagName {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/first.html");
		WebElement header = driver.findElement(By.tagName("h1"));
		String headerText = header.getText();
		System.out.println(headerText);
		if(headerText.contains("selenium"))
		{
			System.out.println("pass: the header has selenium");
		}
		else
			System.out.println("fail: the header do not have selenium");
		//findElement method when it find multiple elements will identify/locate the first element
		//driver.findelement(By.tagname("input")).sendkeys("No internet") 
		
		
		}
		
	}


