package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToPerformBrowserHistoryNavigation {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh(); 
		String title = driver.getTitle();
		if(title.equals("Instagram"))
		{
			System.out.println("Pass:the title is verified");
		}
		else
			System.out.println("Fail:the title is not verified");
	}
}
