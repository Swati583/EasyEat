package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckScreen {
	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
			
	}

}
