package dropdown_select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
WebElement  carwalaDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carwalaDropdown);
		
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		String firstoption = select.getFirstSelectedOption().getText();
		
		System.out.println("The first option is:"+firstoption);
	}

}
