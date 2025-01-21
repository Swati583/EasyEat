package dropdown_select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOptionIsPresentOrNot {
	public static void main(String[] args) {
		int yearToCheck = 1998;
		boolean flag = false;
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		Select select =new Select(yeardropdown);
		
		List<WebElement> allOption = select.getOptions();
		
		
		for(WebElement option:allOption)
		{
			if(option.getText().equals(yearToCheck)) 
			{
				flag =true;
				break;
				
			}
					}
		if(flag)
		{
			System.out.println("The option is present");
		}
		else
			System.out.println("The option is  not present");

	}

}
