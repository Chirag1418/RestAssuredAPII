package testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/?hl=en");
	    //driver.get("https://www.cricbuzz.com/");
	   // driver.close();
	    //Thread.sleep(2000);
	    //driver.quit();
	   // driver.manage().window().maximize();
	    //Thread.sleep(2000);
	   // driver.manage().window().minimize();
	   // Thread.sleep(2000);
	    //driver.navigate().back();
	    //Thread.sleep(500);
	    //driver.navigate().forward();
	    //Thread.sleep(500);
	    //driver.navigate().refresh();
        System.out.println(driver.getTitle());
        String s= driver.getTitle();
        System.out.println(s);
       System.out.println(driver.getCurrentUrl());
       String s1= driver.getCurrentUrl();
       System.out.println(s1);
       
       

	    
	}

}
