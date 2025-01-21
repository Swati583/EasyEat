package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToPerformKeyboardSimulation {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		
		usernameTextField.sendKeys("trainee");
		
		Thread.sleep(2000);
		
		usernameTextField.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		
		usernameTextField.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		
		passwordTextField.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);	
		passwordTextField.sendKeys(Keys.ENTER);
		

	}

}
