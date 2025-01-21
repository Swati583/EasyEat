package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.name("qqfile")).sendKeys("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\Passport Photo.jpg");
	}

}
