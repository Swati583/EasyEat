package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.actitime.com/login-to-product");
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder=\"Enter your email\"]"));
		Email.sendKeys("jaiswalswati583@gmail.com");
		
		Thread.sleep(2000);
		
		  boolean Continuebutton = driver.findElement(By.xpath("//button[@fdprocessedid=\"08ncpw\"]")).isEnabled();
		  
		  if(Continuebutton) {
			  System.out.println("Pass");
		  }
		  else {
			  System.out.println("fail");
			  
			  
		  }
		  
		  driver.switchTo().newWindow(WindowType.TAB);*/
			driver.get("https://www.app.melp.us/staging/index#login");
			WebElement Checkbox = driver.findElement(By.xpath("//span[@onclick=\"toggleIcon(this)\"]"));
			Checkbox.click();
			Thread.sleep(2000);
			boolean box = Checkbox.isSelected();
			if(box) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
	}

}
