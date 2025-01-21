package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByCssSelector {
	public static void main(String[] args) {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/first.html");
driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();

}
}