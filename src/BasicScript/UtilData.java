
package BasicScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilData {
	public String fetchDatafromExcel(String sheeName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\jaisw\\eclipse-workspace\\Automation\\TestData\\seet.xlsx");
		
		return WorkbookFactory.create(fis).getSheet(sheeName).getRow(row).getCell(cell).getStringCellValue();
	}

}
