package BaseClasses;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	  public void launchBrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Sucess Story\\Drivers Jars\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
		  ChromeOptions opt= new ChromeOptions(); 
		  opt.addArguments("--disable-notifications"); 
		  driver= new ChromeDriver(opt); 
		  driver.get("https://kite.zerodha.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  driver.manage().window().maximize();
		  Reporter.log("Browserlaunched sussess",true);
		
		
	   
		    }
	  public void closeBrowser() 
	  { 
	  driver.close(); 
       
	  } 
	  }

