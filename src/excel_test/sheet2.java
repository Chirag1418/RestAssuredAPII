package excel_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\admin\\\\Downloads\\\\Velocity\\\\selenium-java-4.1.2\\\\poi-bin-5.2.1-20220224\\\\test1.xlsx");
		
	//	Workbook test = WorkbookFactory.create(Myfile);
		
		//String value = test.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
			    System.out.println(value);
		}
		}
		
		

	}

}
