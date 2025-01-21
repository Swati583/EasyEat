package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheCountryNameIsPresent {
	

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.goole.co.in/");
		String sourcecode = driver.getPageSource();
		if(sourcecode.contains("India"))
		{
			System.out.println("Pass");
			
		}
		else
		{System.out.println("fail");
	}
	}
}


