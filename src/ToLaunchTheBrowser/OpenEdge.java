package ToLaunchTheBrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.python.modules.thread.thread;

public class OpenEdge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/mnjuser/re");
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		 driver.navigate().to("https://www.facebook.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		 Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}

}
