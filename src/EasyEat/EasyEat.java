package EasyEat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EasyEat {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://partner.easyeat.ai/login");
		WebElement username = driver.findElement(By.id("email"));
		username.click();
		username.sendKeys("devuser-ankitatest@easyeat.ai");
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.click();
		password.sendKeys("devuser@A438");
		driver.findElement(By.xpath("//span[text()=' LOGIN ']")).click();
		driver.findElement(By.xpath("//button[text()=' + Create New Order ']")).click();
		driver.findElement(By.xpath("//img[@alt=\"Takeaway\"]")).click();
		driver.findElement(By.xpath("//div[text()=' OPEN ITEM ']")).click();
		driver.findElement(By.xpath("//img[@alt=\"vhvhv\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Qty\"]")).sendKeys("1");
		driver.findElement(By.xpath("//div[text()='ADD']")).click();
		driver.findElement(By.xpath("//span[text()=' SETTLE BILL ']")).click();

	}

}
