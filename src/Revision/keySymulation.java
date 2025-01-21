package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.hotkey.Keys;

public class keySymulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("aanyareddy073@gmail.com");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		String TEXT = driver.findElement(By.xpath("//span[text()='Please enter valid Email ID/Mobile number']"))
				.getText();
		System.out.println(TEXT);*/
		
		driver.get("https://github.com/login");
		WebElement UserName = driver.findElement(By.id("login_field"));
		
		WebElement Password = driver.findElement(By.name("password"));
		UserName.sendKeys("Swati");
		
		/*Thread.sleep(2000);
		UserName.sendKeys(Keys.CTRL,"a");
		
		Thread.sleep(2000);
		UserName.sendKeys(Keys.CTRL,"c");
		
		Thread.sleep(2000);
		Password.sendKeys(Keys.CTRL,"v");*/
		
	}

}
