package SirKaPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestUsingTestNG 
{
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet Mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(String browser) throws EncryptedDocumentException,
	IOException
	{
	if(browser.equals("chrome"))
	{
	Reporter.log("Launching chrome browser",true);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\chromedriver_win32y\\\\chromedriver.exe");
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver= new ChromeDriver(opt);
	}
	else if (browser.equals("firefox"))
	{
	Reporter.log("Launching firefox browser",true);
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\geckodriver-v0.30.0-win32\\geckodriver.exe");
	FirefoxOptions opt= new FirefoxOptions();
	opt.addArguments("--disable-notifications");
	driver= new FirefoxDriver(opt);
	}
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	Reporter.log("Browserlaunched sussess",true);
	FileInputStream Myfile= new FileInputStream("C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\poi-bin-5.2.1-20220224\\test1.xlsx");
	Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet6");
	login= new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp()
	{
	String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
	String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
	Reporter.log("Entering UserID and Password ",true);
	login.enterUserID(USERID);
	login.enterPAssword(PWD);
	login.clickOnLoginButtton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	Reporter.log("Entering PIN",true);
	pin.enterPin(PIN);
	pin.clickonContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void validateUserID()
	{
	Reporter.log("validating userID",true);
	String expectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getActualUserID();
	Assert.assertEquals(actualUserID, expectedUserID,"actual and expected useriD not matching");
	Reporter.log("User ID validated suceesfully, TC is passed",true);
	}
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
	Reporter.log("Logging out...",true);
	home.logout();
	}
	@AfterClass
	public void closeBrowser()
	{
	Reporter.log("closing browser",true);
	driver.close();
	}
	}
	