package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDropBy {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameElement);
		
		WebElement box= driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		action. dragAndDropBy(box,50,50).perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API documentation")).click();

	}

	
	}


