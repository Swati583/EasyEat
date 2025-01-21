package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfParticularElement {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		File source = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\swati ss\\facebooklogin button ss.png");
		
		Files.copy(source, destination);
	}

}
