package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckDimension {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = driver.manage().window().getSize();
		int width = dimension.getWidth();
		int height = dimension.getHeight();
		
		System.out.println("The Height is:"+height);
		System.out.println("The Width is:"+width);
}
}
