package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
		boolean b = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(b);
	}
	
}
