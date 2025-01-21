package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	//findBy: identification and declaration of element
	@FindBy(id = "username")
	public WebElement usertextField;
	 
	@FindBy(name = "pwd")
	public WebElement passwordtextField;
	
	@FindBy(xpath= "//div[text()='login'")
	public WebElement LoginButton;
	
	//Business Logics/generic method
	public void LoginAction(String username,String password)
	{
		usertextField.sendKeys(username);
		passwordtextField.sendKeys(password);
		LoginButton.click();
		
	}
}
