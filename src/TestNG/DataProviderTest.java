package TestNG;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//how will u execute same test script multiple time with different data
public class DataProviderTest {
	//data recei  ver
	@Test(dataProvider = "data")
	public void  trainer(String name,String subject)
	{
		System.out.println("Trainer Name:"+name+"subject:"+subject);
	}
	//data sender
	@DataProvider
	public Object[][] data()
			{
			Object[][] arr = new Object[4][2];
			
			arr[0][0] = "Shambhu sir";
			arr[1][0] = "Priya mam";
			arr[2][0] = "vinay sir";
			arr[3][0] = "Akash sir";
			
			
			arr[0][1] = "core java";
			arr[1][1] = "Advance java";
			arr[2][1] = "manual Testing";
			arr[3][1] = "Selenium";
			
			return arr;
			}
}
