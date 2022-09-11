package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Example6_getAllDataInAColumn 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i =0;i<=lastRowIndex;i++)
		{
			String  s1 = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(s1);
			
		}
	}

}
