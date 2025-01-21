package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToWriteXpathByAxes {
	public static void main(String[] args) {
		String productName = "APPLE iPhone 14(Blue, 128 GB)";
		String productprice="₹70,999";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.brand%255B%255D%3DAPPLE");
		WebElement priceblueIphone= driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹70,999']"));
		String price=priceblueIphone.getText();
		System.out.println(price);
	}
}
