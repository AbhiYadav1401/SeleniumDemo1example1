package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getAllDataInRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for (int i =0;i<=lastcellindex;i++)
		{
			String S1= sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(S1+"");
		}
	}

}
