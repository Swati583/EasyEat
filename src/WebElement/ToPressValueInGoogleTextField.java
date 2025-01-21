package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToPressValueInGoogleTextField {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement textField =  driver.findElement(By.name("q"));
		String tagname = textField.getTagName();
		if(tagname.equals("textarea"))
		{
			textField.sendKeys("selenium");
			System.out.println("pass:the tagname is  matching");
		}
		else
		System.out.println("fail:the tagname is not matching");
	}

}
