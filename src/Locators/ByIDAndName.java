package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByIDAndName {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/first.html");
	WebElement usernameTextField = driver.findElement(By.id("abc123"));
	usernameTextField.sendKeys("swati jaiswal");
	WebElement passwordTextField = driver.findElement(By.name("FirstWeb"));
	passwordTextField.sendKeys("SWATI");

}
}
