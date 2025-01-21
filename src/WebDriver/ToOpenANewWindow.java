package WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenANewWindow {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}

}
