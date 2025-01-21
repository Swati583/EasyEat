package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToClick {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		// ElementclickInterceptedException will come
		driver.findElement(By.linkText("About Selenium")).click();

		
		  /*String id = driver.getWindowHandle();
		  
		  for(String x:id) {
		 
		  
		 
		  driver.switchTo().window(id);
		  driver.findElement(By.linkText("Got it!")).click();
		  driver.findElement(By.linkText("About Selenium")).click();*/
		 
	}
}
