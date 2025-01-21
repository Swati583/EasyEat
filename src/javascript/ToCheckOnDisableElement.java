package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckOnDisableElement {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		
		driver.findElement(By.linkText("jdk-11.0.19_windows-x64_bin.zip")).click();
		
		WebElement disabledButton = driver.findElement(By.linkText(("Download jdk-11.0.19_window-x64_bin.zip")));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguement[0].click()",disabledButton);
		
		
	}

}
