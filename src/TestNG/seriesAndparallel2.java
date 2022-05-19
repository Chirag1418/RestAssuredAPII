package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seriesAndparallel2 {
  @Test
  public void SeriesPrallel2() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Sucess Story\\Drivers Jars\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
	  
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/?hl=en");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 driver.close();
  }
}
