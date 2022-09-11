package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_readNumericDataAsAString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
	String s1 =WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
	System.out.println(s1);
	}
}