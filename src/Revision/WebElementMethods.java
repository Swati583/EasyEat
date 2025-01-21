package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement UserText = driver.findElement(By.xpath("//label[@for=\"login_field\"]"));
		 String MSG = UserText.getText();
		 System.out.println(MSG);
		 WebElement UserName = driver.findElement(By.id("login_field"));
		 UserName.click();
		 UserName.sendKeys("Swati");
		 UserName.clear();
		 UserName.sendKeys("Shanaya");
		  WebElement password = driver.findElement(By.id("password"));
		  password.click();
		  password.sendKeys("jaiswal");
		  //password.sendKeys(Keys.ENTER);
		  //driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		  driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();

		   boolean popup = driver.findElement(By.xpath("//div[@aria-atomic=\"true\"][1]")).isDisplayed();
		  if(popup)
		  {
			  System.out.println("pass:the error msg is Didplayed");
		  }
		  else
		  {
			  System.out.println("fail:the error msg is not Didplayed");  
		  }
	}

}
