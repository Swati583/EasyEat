package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLoginIntoActiTimeByEnter {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='username']"));
		usernameTextBox.sendKeys("admin");
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@name='pwd']"));
		passwordTextBox.sendKeys("manager");
		passwordTextBox.sendKeys(Keys.ENTER);
		
		
		
	}

}
