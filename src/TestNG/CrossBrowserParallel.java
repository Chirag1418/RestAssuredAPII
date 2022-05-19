package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallel {
  @Parameters("browserName")	
  @Test
  public void CB(String browserName) throws InterruptedException 
  {
	  WebDriver driver=null;
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
	  }
	  
	  else if (browserName.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
	  
		 driver.get("https://vctcpune.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
	 }
  }

