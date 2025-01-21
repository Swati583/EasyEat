package Revision;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTab {
	public static void main(String[]args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String PID = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://mail.google.com/");
		String CID = driver.getWindowHandle();
		Set<String> ALLID = driver.getWindowHandles();
		System.out.println(ALLID);
		driver.switchTo().window(PID);

}
}