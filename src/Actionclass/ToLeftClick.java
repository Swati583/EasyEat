package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeftClick {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://skillrary.com/");
		
		WebElement catagoryButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		
		Actions action = new Actions(driver);
		action.click(catagoryButton).perform();
		
	}

}
