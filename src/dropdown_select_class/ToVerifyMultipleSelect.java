package dropdown_select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultipleSelect {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		WebElement carDropDown = driver.findElement(By.id("cars"));
			Select select =new Select(carDropDown);
			boolean multiple = select.isMultiple();
			if(multiple)
			{
				System.out.println("The dropdown is multi select");
			}
			else
				System.out.println("The dropdown is single select");
	}

}
 