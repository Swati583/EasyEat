package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckDimensionAndPosition {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		Dimension initialDimension = driver.manage().window().getSize();
		Point initialPosition = driver.manage().window().getPosition();
		 
		Dimension newDim = new Dimension(500,400);
		driver.manage().window().setSize(newDim);
		Thread.sleep(2000);
		Point newPos = new Point(80,100);
		driver.manage().window().setPosition(newPos);
		
		Dimension finalDimension = driver.manage().window().getSize();
		Point finalPosition = driver.manage().window().getPosition();
		
		if(initialDimension != finalDimension && initialPosition != finalPosition)
		{
		System.out.println("pass:the dimension and position has been changed");	
		}
		else
			System.out.println("fail:the dimension and position has not been changed");
		
	}
	
			
	}


