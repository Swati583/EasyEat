package RunTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class CrossBrowser {
	
	public static void test(WebDriver driver)
	
	{
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		if(driver.getTitle().equals("Instagram"))
		{
			System.out.println("pass:the title is verified");
		}
		else
		
			System.out.println("fail:the title is not verified");
		driver.quit();
	}
	
		
	

}
