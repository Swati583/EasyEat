package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRateApplication {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://amp.dev/documentation/examples/websites/interactivity-dynamic-content/star_rating/?edirected");
		
		WebElement studioOption = driver.findElement(By.linkText("rating"));
		Actions action = new Actions(driver);
		action.moveToElement(studioOption).perform();
	}
}
