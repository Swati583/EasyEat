package ToLaunchTheBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheURL {
	public static void main(String[] args) {
		String expectedURL="https://www.instagram.com/";
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		String actualURL=driver.getCurrentUrl();
		System.out.println("The actual URL is:"+actualURL);
		System.out.println("The expected URL is:"+expectedURL);
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Pass:The URL is verified");
		}
		else {
			System.out.println("Fail:The URL is not verified");
		}
	}
	

}
