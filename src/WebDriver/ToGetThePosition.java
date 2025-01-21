package WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetThePosition {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	Point position = driver.manage().window().getPosition();
	System.out.println(position);
	int xCoordinate = position.getX();
	int yCoordinate = position.getY();
	System.out.println("The x coordinate is:"+xCoordinate);
	System.out.println("The y coordinate is:"+yCoordinate);
} 
}
