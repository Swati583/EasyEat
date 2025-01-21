package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
	public static void main(String[]args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/apple-iphone-16-white-256-gb/p/itm7c0281cd247be?pid=MOBH4DQFCU7ZY9HG&lid=LSTMOBH4DQFCU7ZY9HGLY6DQP&marketplace=FLIPKART&q=apple+mobiles&store=tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&fm=organic&iid=308e5fd6-5d54-4102-b958-b3b802c02617.MOBH4DQFCU7ZY9HG.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=947hemaes00000001736947460148&qH=cb603b9543d774e1");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);
		driver.navigate().to("https://mail.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String ID = driver.getWindowHandle();
		System.out.println(ID);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.facebook.com/");
		driver.close();
	}

}
