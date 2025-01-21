package ToLaunchTheBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToverifyTheTitle {
	public static void main(String[] args) {
		//expectedTitle
		String expectedTitle="Facebook – log in or sign up";
		
		//Launch the Browser
		EdgeDriver driver = new EdgeDriver();
		
		//Nav to the URL
		driver.get("https://www.facebook.com/");
		
		//Fetching the Title
		String actualTitle=driver.getTitle();
		
		//Print the expected and actual in the console
		System.out.println("The expected Title is:"+expectedTitle);
		System.out.println("The actual Title is:"+actualTitle);
		
		//verifying whether the actual and the expected are correct or not
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass:title is verified");
		}
		else
		{
			System.out.println("fail:title is not verified");
		}
	}

}
