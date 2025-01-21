 package TestDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//Convert physical representation of property file to java Representation
		FileInputStream fis = new FileInputStream("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\TestDataProperties.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String urlPropertyFile = prop.getProperty("url");
		
		//Read the key and value from java Representation
		prop.load(fis);
		
		//Calling the value using the key
		String urlFromPropertyFile = prop.getProperty("url");
		String usernameFromPropertyFile = prop.getProperty("username");
		String passwordFromPropertyFile = prop.getProperty("password");
		
		//Printing it on the console
		System.out.println("The url is:"+urlFromPropertyFile);
		System.out.println("The username is:"+usernameFromPropertyFile);
		System.out.println("The password is:"+passwordFromPropertyFile);
		
	}
}
		
