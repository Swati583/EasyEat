package RunTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
	public static void main(String[] args) {
		CrossBrowser.test(new ChromeDriver());
		System.out.println("The application is tested in ChromeDriver");
		CrossBrowser.test(new EdgeDriver());
		System.out.println("The application is tested in EdgeDriver");
		
		
	}

}
