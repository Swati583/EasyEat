package TestDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\swati.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		  Sheet sheet =workbook.getSheet("Sheet1");
		  
		  Row row = sheet.getRow(1);
		  
		  Cell cell = row.getCell(0);
		  
		  String customerName = cell.getStringCellValue();
		  
		  System.out.println("The customer name is:"+customerName);
		  
		  long customerPhoneNo =(long)row.getCell(1).getNumericCellValue();
		  
		  System.out.println(customerName+"phone no is:"+customerPhoneNo);
		  
		  boolean customerStatus = row.getCell(2).getBooleanCellValue();
		  
		  System.out.println(customerName+" status is:"+customerStatus);
		  
		  if(customerStatus)
		  {
			  System.out.println("Go for marriage");
		  }
		  else
		  
			  System.out.println("find someone");
		  
		  System.out.println(customerName+" status is:"+customerStatus);
		  
		  System.out.println("*******************");
		  
		  Row row3 = sheet.getRow(3);
		  
		  String customerName2 = row3.getCell(0).getStringCellValue();
		  
		  System.out.println("customer 2 name is:"+customerName2);
		  
		  boolean customer2Status = row3.getCell(2).getBooleanCellValue();
		  
		  System.out.println(customerName2+" status is "+customer2Status);
		  
		  
		 
		  

		  
	}

}

