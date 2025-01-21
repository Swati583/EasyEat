package javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToScrollHorizontally {
	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
		EdgeDriver driver = new EdgeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//navigate to URL
				driver.get("https://www.kwokyinmak.com/");
				
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(2000,0)");
				
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("window.scrollBy(-2000,0)");
				
	}

}
