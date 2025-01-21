package AutoSuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllAutoSuggessions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement textField = driver.findElement(By.name("q"));
		textField.sendKeys("virat");
		Thread.sleep(3000);
		
		List<WebElement> allsuggession = driver.findElements(By.xpath("//span[contains(text(),'irat')]"));
		
		System.out.println(allsuggession);
		int numberofSuggessions = allsuggession.size();
		System.out.println("the number of suggession are :"+numberofSuggessions);
		for(WebElement suggession:allsuggession)
		{
			System.out.println(suggession.getText());
		}
	}

}
