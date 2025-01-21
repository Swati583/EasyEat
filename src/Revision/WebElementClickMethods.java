package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementClickMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://chatgpt.com/auth/login");
		//Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Log in']")).click();
}

}
