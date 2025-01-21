package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetTheSize {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		Dimension Dim = driver.manage().window().getSize();
		
		
	}

}
