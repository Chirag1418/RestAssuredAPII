package KiteValidation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Framework_POM.KiteLoginPage;

public class KiteUsingTestNG {
    WebDriver driver;
    Sheet MySheet;
    loginPage login;
    PinPage pin;
    mainPage home;

    @Parameters("BrowserName")
   @BeforeClass
	public void launchBrowser(String BrowserName) throws EncryptedDocumentException, IOException
	{
    	if(BrowserName.equals("chrome"))
    	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().window().maximize();
		 Reporter.log("Browser launched success chrome",true);
    	}
    	
    	  else if (BrowserName.equals("firefox"))
 		 {
 			 System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\Velocity\\\\selenium-java-4.1.2\\\\geckodriver-v0.30.0-win32\\\\geckodriver.exe");
 			 driver= new FirefoxDriver();
 			driver.get("https://kite.zerodha.com/");
 			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 			 driver.manage().window().maximize();
 			Reporter.log("Browser launched success firefox",true);
 		}
		 
		 
		 
		 FileInputStream MyFile=new FileInputStream("C:\\\\Users\\\\admin\\\\Downloads\\\\Velocity\\\\selenium-java-4.1.2\\\\poi-bin-5.2.1-20220224\\\\test1.xlsx");
		 
		  MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet6");
		
		  login=new loginPage(driver);
		  pin=new PinPage(driver);	 
		  home=new mainPage(driver);
	}
	
	@BeforeMethod
	
	public void loginToKiteApp()
	{
		String USERID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PASSWORD = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		login.enterUserID(USERID);
		login.enterPassword(PASSWORD);
		login.clickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(PIN);
       pin.ClickOnContinue();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));


	}
	

@Test
  public void ValidateUserID() 
  {
	String ExpectedUsedID = MySheet.getRow(0).getCell(0).getStringCellValue();  
	
	String ActualUserID = home.UserText();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	
	Assert.assertEquals(ExpectedUsedID, ActualUserID, "UserID not matching");
	
  }

@AfterMethod
public void logoutFromKiteApp() throws InterruptedException
{
	home.logoutbutton();
}

@AfterClass
public void closeBrowser()
{
	driver.close();
}


}
