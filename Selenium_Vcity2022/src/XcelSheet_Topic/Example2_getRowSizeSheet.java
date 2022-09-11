package XcelSheet_Topic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getRowSizeSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\getNumericData.xlsx");
		 int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		 System.out.println(rowsize);
	}
}
