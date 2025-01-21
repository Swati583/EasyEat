package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToFetchWindowID {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		
	}

} 
