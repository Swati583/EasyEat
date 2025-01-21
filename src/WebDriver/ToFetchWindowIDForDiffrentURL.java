package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToFetchWindowIDForDiffrentURL {
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		String windowIDforgoogle = driver.getWindowHandle();
		System.out.println(windowIDforgoogle);
		
		driver.navigate().to("https://www.facebook.com/");
		String windowIDforfacebook = driver.getWindowHandle();
		System.out.println(windowIDforfacebook);
	}

}
