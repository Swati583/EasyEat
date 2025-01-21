package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickOnEnabledElement {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement downloadLink = driver.findElement(By.linkText("4.10.0"));
		//downcast javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// call the execute script() and pass key to enter value.
		js.executeScript("arguments[0}.click()",downloadLink);
	}

}
