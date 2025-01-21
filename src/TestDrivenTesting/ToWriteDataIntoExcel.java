package TestDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\swati.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		 Sheet sheet = workbook.getSheet("Sheet1");
		 
		 sheet.createRow(4).createCell(0).setCellValue("jaiswal");
		 FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\jaisw\\\\eclipse-workspace\\\\Automation\\\\TestData\\\\swati.xlsx");
		 
		 workbook.write(fos);
		workbook.close();
		
		System.out.println("Data has been modified");
		
		 
	}

}
