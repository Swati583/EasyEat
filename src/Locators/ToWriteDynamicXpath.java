package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToWriteDynamicXpath {
	public static void main(String[] args) {
		String productName = "APPLE iPhone 13 (Starlight, 128 GB)";
		String productprice="₹60,999";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.brand%255B%255D%3DAPPLE");
		WebElement priceblueIphone= driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productprice+"']"));
		String price=priceblueIphone.getText();
	
		 System.out.println(productprice);
		System.out.println(productName);
	}
}
//by using this program we can handle dynamic elements.