package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement capital1 = driver.findElement(By.id("box3"));
		WebElement country1 = driver.findElement(By.id("box103"));
		WebElement capital2 = driver.findElement(By.id("box2"));
		WebElement country2 = driver.findElement(By.id("box102"));
		
		WebElement capital3 = driver.findElement(By.id("box4"));
		WebElement country3 = driver.findElement(By.id("box104"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDrop(capital1, country1).perform();
		action.dragAndDrop(capital2, country2).perform();
		action.dragAndDrop(capital3, country3).perform();
		
		
		
	}

}
