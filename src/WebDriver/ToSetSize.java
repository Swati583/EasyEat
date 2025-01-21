package WebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSetSize {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		Dimension dim = new Dimension(800,500);
		driver.manage().window().setSize(dim);
		
	}

}
