package excel_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream MyFile=new FileInputStream("C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\poi-bin-5.2.1-20220224\\test1.xlsx");
		
        Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet5");
        
       int totalRows = MySheet.getLastRowNum();
       
      int totalColumns = MySheet.getRow(0).getLastCellNum()-1;
      
      System.out.println(totalRows);
      System.out.println(totalColumns);
      
      for(int i=0;i<=totalRows;i++)
      {
    	  for(int j=0;j<=totalColumns;j++)
    	  {
    		  try {
    			  CellType type = MySheet.getRow(i).getCell(j).getCellType();
    		
    			
    		 if(type.equals(CellType.STRING))
    		 {
    			String StringValue = MySheet.getRow(i).getCell(j).getStringCellValue();
    			System.out.println(StringValue);
    		 }
    		 
    		 else if(type.equals(CellType.BOOLEAN))
    		 {
    			 boolean BolleanValue = MySheet.getRow(i).getCell(j).getBooleanCellValue();
     			System.out.println(BolleanValue);

    		 }
    		 else if(type.equals(CellType.NUMERIC))
    		 {
    			 double NumericValue = MySheet.getRow(i).getCell(j).getNumericCellValue();
     			System.out.println(NumericValue);

    		 }
    		}
    		catch(Exception E)
    		{
    			System.out.println(" ");
    		}
    		
    		 
    		 
    		 
    		 
    		 
    	  }
    	  
      }
	}

}
