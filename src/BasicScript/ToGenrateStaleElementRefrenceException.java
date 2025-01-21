package BasicScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGenrateStaleElementRefrenceException {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		WebElement textBox = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		textBox.sendKeys("selenium");
		driver.navigate().refresh();
		Thread.sleep(2000);
		textBox.sendKeys("Automation");
	}

}
