package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class HandleFileUploadUsingSikuli {
	public static void main(String[] args) throws FindFailed {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Pattern filename = new Pattern("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\Screenshot naukari.png");
		Pattern openbutton = new Pattern("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\Screenshot naukari open.png");
		
		Screen screen = new Screen();
		screen.wait(filename,20);
		screen.type(filename, "C:\\\\Users\\\\jaisw\\\\eclipse-workspace\\\\Automation\\\\TestData\\\\Screenshot naukari.png");
		screen.click(openbutton);
	}

}
