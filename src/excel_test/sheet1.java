package excel_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream Myfile=new FileInputStream("C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\poi-bin-5.2.1-20220224\\test1.xlsx");
	
		//String value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
       // System.out.println(value);
        
       // Thread.sleep(2000);
        
      // double value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
				//System.out.println(value1);
				
				Workbook test = WorkbookFactory.create(Myfile);
				
				//System.out.println(test);
				
				Sheet MySheet = test.getSheet("Sheet1");
				
				//System.out.println(MySheet);
				
				Row myRow = MySheet.getRow(0);
				
				//System.out.println(myRow);
				
				Cell myCell = myRow.getCell(0);
				
				System.out.println(myCell);
				
				String MyValue = myCell.getStringCellValue();
				
				//System.out.println(MyValue);
				
	}

}
