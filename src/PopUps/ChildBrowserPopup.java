package PopUps;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		String titleToswitch= "Projects";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@class=\"nav-link\"]"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		for(WebElement link:alllinks)
		{
			link.click();
		}
		Thread.sleep(2000);
		action.keyUp(Keys.CONTROL).perform();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.contains(titleToswitch))
			{
				WebElement w3cOption = driver.findElement(By.linkText("W3C Recommendation!"));
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()",w3cOption);
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
