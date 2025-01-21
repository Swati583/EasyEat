package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetUniqueID {
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		//chromeDriver
		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);
		
		EdgeDriver driver1 = new EdgeDriver();
		
	String windowID2 = driver1.getWindowHandle();
	System.out.println(windowID2);
	
	}
}
