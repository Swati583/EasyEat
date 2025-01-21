package Revision;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/apple-iphone-15-blue-128-gb/p/itmbf14ef54f645d?pid=MOBGTAGPAQNVFZZY&lid=LSTMOBGTAGPAQNVFZZYO7HQ2L&marketplace=FLIPKART&q=apple+mobiles&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&fm=search-autosuggest&iid=91ebed90-0cae-474f-962c-c3032223e583.MOBGTAGPAQNVFZZY.SEARCH&ppt=sp&ppn=sp&qH=cb603b9543d774e1");
		String Title = driver.getTitle();
		System.out.println(Title);

		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// String Content = driver.getPageSource();
		// System.out.println(Content);
		String ID = driver.getWindowHandle();
		System.out.println(ID);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.naukri.com/mnjuser/recommendedjobs");

		System.out.println("********************");
		String Title1 = driver.getTitle();
		System.out.println(Title1);

		String ID1 = driver.getWindowHandle();
		System.out.println(ID1);

		System.out.println("********************");
		Set<String> AllID = driver.getWindowHandles();
		System.out.println(AllID);

		System.out.println("********************");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();

		driver.close();
	}

}