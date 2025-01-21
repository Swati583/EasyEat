package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/alerts");
		
		//Click the button to get pop up
		driver.findElement(By.id("alertButton")).click();
		
		//switching the driver control to the alert
		Alert popup = driver.switchTo().alert();
		
		//you can write this also
		//alert popup=driver.switch.alert.accept;
		
		Thread.sleep(2000);
		
		//clicking on the ok button
		popup.accept();
		
		
		Thread.sleep(2000);
		
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		//clicking the button to get the confirmation pop up
		driver.findElement(By.id("confirmButton")).click();
		
		
		Thread.sleep(2000);
		
		//clicking on the cancel button
		popup.dismiss();
		
		//new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.id("promtButton")).click();
		
		
		popup.sendKeys("value pass kar rahi hu");
		
		String message = popup.getText();
		System.out.println(message);
		
		popup.accept();
		
		
		
		
		
	}

}
