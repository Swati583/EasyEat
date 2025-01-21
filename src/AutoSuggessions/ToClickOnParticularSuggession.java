package AutoSuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnParticularSuggession {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement textField = driver.findElement(By.name("q"));
		textField.sendKeys("virat");
		Thread.sleep(3000);
		List<WebElement> allsuggession = driver.findElements(By.xpath("//span[contains(text(),'irat')]"));
		for(WebElement suggenssion:allsuggession)
		{
			if(suggenssion.getText().contains("twitter"))
			{
				suggenssion.click();
				break;
			}
		}
		
	}

}
