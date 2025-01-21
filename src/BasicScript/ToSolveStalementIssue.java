package BasicScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PomRepository.GoogleHomePage;

public class ToSolveStalementIssue {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		GoogleHomePage googleHome = new GoogleHomePage(driver);
		
		googleHome.textBox.sendKeys("selenium");
		driver.navigate().refresh();
		googleHome.textBox.sendKeys("Automation");
		
		
	}

}
