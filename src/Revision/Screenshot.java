package Revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
TakesScreenshot ts = (TakesScreenshot)driver;

File Source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\swati ss.png");
Files.copy(Source,destination);
	}
}
