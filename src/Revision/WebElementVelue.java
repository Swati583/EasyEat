package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementVelue {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.melp.us/");
	WebElement img = driver.findElement(By.xpath("//img[@alt=\"logo\"]"));
	String picture = img.getAttribute("alt");
	System.out.println(picture);
	String CssV = img.getCssValue("box-sizing");
	System.out.println(CssV);
	 String Tag = img.getTagName();
	System.out.println(Tag);
	
	

	}

}
