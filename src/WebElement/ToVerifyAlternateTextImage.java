package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyAlternateTextImage {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/first.html");
		String alternateTextImage = driver.findElement(By.xpath("//img[@alt='my image']")).getAttribute("alt");
		System.out.println(alternateTextImage);
	}

}
