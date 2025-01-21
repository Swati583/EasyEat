package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckLocation {
	public static void main(String[] args) {
		String place = "noida";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		
		WebElement frameElement = driver.findElement(By.name("app"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.findElement(By.id("searchboxinput")).sendKeys(place);
		
		driver.findElement(By.id("searchbox-searchbutton")).click();
		
		boolean isPlaceDisplaying = driver.findElement(By.xpath("//h1[text()='"+place+"']")).isDisplayed();
		
		if(isPlaceDisplaying) {
			System.out.println("Pass: the place is displaying");
		}
		else
			System.out.println("Pass: the place is displaying");
		
	}
}
