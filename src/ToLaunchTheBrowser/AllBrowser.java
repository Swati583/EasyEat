package ToLaunchTheBrowser;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
 WebDriver driver = new EdgeDriver();
 driver.switchTo().newWindow(WindowType.TAB);
 driver.navigate().to("https://www.naukri.com/myapply/historypage");
 //driver.getTitle();
 //driver.close();
 driver.switchTo().newWindow(WindowType.TAB);
 driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
 //driver.getTitle();
 
 driver.switchTo().newWindow(WindowType.TAB);
 driver.navigate().to("https://www.facebook.com/");
 //driver.getTitle();
 driver.close();
 
// driver.switchTo().newWindow(WindowType.TAB);
 //driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
 //driver.get("https://mail.google.com/mail/u/0/#inbox");
 driver.switchTo().alert().accept();
 /*Thread.sleep(2000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);*/
 
 driver.close();
	}
}
