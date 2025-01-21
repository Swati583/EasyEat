package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementSize {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement UserName = driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
		Dimension Size = UserName.getSize();
		int Hight = Size.getHeight();
		System.out.println(Hight);
		int Width = Size.getWidth();
		System.out.println(Width);

		WebElement Password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		Dimension Pass = Password.getSize();
		int Hight1 = Pass.getHeight();
		System.out.println(Hight1);
		int Width1 = Pass.getWidth();
		System.out.println(Width1);

		if (Hight == Hight1 && Width == Width1) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		System.out.println("*******************************");

		// using getlocation() method to find the position
		// WebElement UserName =
		// driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
		// WebElement Password =
		// driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));

		Point ULoc = UserName.getLocation();
		int X = ULoc.getX();
		System.out.println(X);
		int Y = ULoc.getY();
		System.out.println(Y);

		Point PLoc = Password.getLocation();
		int X1 = PLoc.getX();
		System.out.println(X1);
		int Y1 = PLoc.getY();
		System.out.println(Y1);

		if (X == X1 && Y == Y1) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		System.out.println("==================================");
		Rectangle Ract = UserName.getRect();
		int h = Ract.getHeight();
		System.out.println(h);
		int w = Ract.getWidth();
		System.out.println(w);

		int rx = Ract.getX();
		System.out.println(rx);

		int ry = Ract.getY();
		System.out.println(ry);

	}

}
