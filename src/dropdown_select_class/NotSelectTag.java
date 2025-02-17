package dropdown_select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectTag {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement selectValueDropdown = driver.findElement(By.xpath("//div[text()='Select Option']"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(selectValueDropdown, "Group2,option 1").sendKeys(Keys.ENTER).perform();
	}
}
 