package WebElement;

 
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyAllingmentIssues {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jaisw/OneDrive/Desktop/allignment.html");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		Point usernameLoc = username.getLocation();
		Point passwordLoc = password.getLocation();
		
		Dimension usernameDim = username.getSize();
		Dimension passwordDim = password.getSize();
		
		 int usernameStartX = usernameLoc.getX();
		 int passwordStartX = passwordLoc.getX();
		 
		 int usernameWidth = usernameDim.getWidth();
		 int passwordWidth = passwordDim.getWidth();
		 
		 int usernameEndX = usernameStartX+usernameWidth;
		 int passwordEndX = passwordStartX+passwordWidth;
		 
		 if(usernameStartX==passwordStartX &&usernameEndX==passwordEndX )
		 {
			 System.out.println("pass: the allingment issue is verified");
		 }
		 else
			 System.out.println("fail: the allingment issue is not verified");
		 
		 
		 
		 
	}

}
