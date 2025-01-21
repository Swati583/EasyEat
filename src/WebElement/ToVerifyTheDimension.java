package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheDimension {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/allignment.html");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		Dimension usernameDimension = username.getSize();
		int usernamewidth = usernameDimension.getWidth();
		int usernameheight = usernameDimension.getHeight();
		
		System.out.println("User width is:   "+usernamewidth);
		System.out.println("User height is: "+usernameheight);

		Dimension passwordDimension = password.getSize();
		int passwordwidth = passwordDimension.getWidth();
		int passwordheight = passwordDimension.getHeight();
		System.out.println("**************");
		System.out.println("Password width is: "+passwordwidth);
		System.out.println("Password height is: "+passwordheight);
		if(usernameheight==passwordheight && usernamewidth==passwordwidth)
		{
			System.out.println("pass:The Dimension are verified");
		}else
			System.out.println("fail:The Dimension are not verified");
	}

}
