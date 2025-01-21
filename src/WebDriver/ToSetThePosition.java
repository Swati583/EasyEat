package WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ToSetThePosition {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		Point newPos = new Point(500,300);
		driver.manage().window().setPosition(newPos);
	}

}
