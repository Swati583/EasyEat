package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShotOfFacebookWebpage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//downcast the driver to TakeScreenShot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//use getScreenShotAs() to take screenshot in source variable
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		//declear the destination in which the screenshot will be stored
		File destination = new File("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\swati ss\\facebook ss.png");
		
		//copy the source to the destination variable
		Files.copy(source,destination);
		
		//after all we have to refresh the project.
	}

}
