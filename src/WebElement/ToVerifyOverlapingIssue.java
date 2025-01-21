package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyOverlapingIssue {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/allignment.html");
		Rectangle passwordRect = driver.findElement(By.xpath("//input[@type='password']")).getRect();
		Rectangle buttonRect = driver.findElement(By.xpath("//button[text()='Submit']")).getRect();
		int passwordEndY = passwordRect.getY()+passwordRect.getHeight();
		int buttonStartY = buttonRect.getY();
		if(buttonStartY==passwordEndY)
		{
			System.out.println("pass:the overlaping issue is verified");
		}
		else
			System.out.println("fail:the overlaping issue is not verified");
	}

}
