package javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToScrollUsingVertically {
	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
		EdgeDriver driver = new EdgeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate to URL
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		
		
		//js.executeAsynScript("window.scrollBy(0,2000)");
		//Thread.sleep(2000);
		//js.executeAsynScript("window.scrollBy(0,-500)");
		
		
		
	}

}
