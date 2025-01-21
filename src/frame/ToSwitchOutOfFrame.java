package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSwitchOutOfFrame {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/frame.html");
		WebElement frameElement = driver.findElement(By.id("frame"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	}

}
