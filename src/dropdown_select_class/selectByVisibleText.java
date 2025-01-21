package dropdown_select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		
		Select select = new Select(dayDropDown);
		
		select.selectByIndex(20);
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		
		Select selectMonth = new Select(monthDropDown);
		
		selectMonth.selectByVisibleText("Nov");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(yearDropDown);
		
		selectYear.selectByValue("1998");
		
		
		
	}

}
