package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getColSizeInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
		short column_Size =WorkbookFactory.create(file).getSheet("Sheet").getRow(1).getLastCellNum();
		System.out.println("column_Size");
	}
}
