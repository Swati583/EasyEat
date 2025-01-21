package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) {
		//String username = "Admin";
		//String password = "Admin";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}