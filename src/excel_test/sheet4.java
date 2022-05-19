package excel_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream MyFile= new FileInputStream("C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\poi-bin-5.2.1-20220224\\test1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		
		CellType type0 = MySheet.getRow(0).getCell(0).getCellType();
		CellType type1 = MySheet.getRow(0).getCell(1).getCellType();
	   CellType type2 = MySheet.getRow(0).getCell(2).getCellType();
	  CellType type3 = MySheet.getRow(0).getCell(3).getCellType();
	  
	  System.out.println(type0);
	  System.out.println(type1);
	  System.out.println(type2);
	 System.out.println(type3);

	}

}
