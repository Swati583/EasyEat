package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.Pattern;

public class PrintPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\popup.html");
				
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern filename = new Pattern("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\Screenshot file name.png");
		Pattern savebutton = new Pattern("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\Screenshot save.png");
				
	}

}
//https://www.geeksforgeeks.org/how-to-create-a-pop-up-to-print-dialog-box-using-javascript/
//In this program we have to use this website.




