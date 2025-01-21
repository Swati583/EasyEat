package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToPressEnter {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement textbox = driver.findElement(By.name("q"));
		System.out.println(textbox);
		textbox.sendKeys("selenium");
		textbox.sendKeys(Keys.ENTER);
		
	}
}
