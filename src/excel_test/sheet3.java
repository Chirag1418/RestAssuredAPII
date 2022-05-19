package excel_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\poi-bin-5.2.1-20220224\\test1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		short lcn = MySheet.getRow(0).getLastCellNum();
		
		int lrn = MySheet.getLastRowNum();
		
		for(int i=0;i<=lrn;i++)
		{
			for(int j=0;j<=lcn-1;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
		    }
		
	   }
		

	}

}
