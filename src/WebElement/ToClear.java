 package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToClear {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/first.html");
		WebElement username = driver.findElement(By.xpath("//input[@value='swati']"));
		WebElement password = driver.findElement(By.xpath("//input[@value='jaiswal']"));
		username.clear();
		username.sendKeys("shanaya");
		password.clear();
		password.sendKeys("jazz0000");
	}

}
