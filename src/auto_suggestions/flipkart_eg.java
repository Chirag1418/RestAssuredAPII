package auto_suggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_eg {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
           driver.findElement(By.xpath("//button[text()='✕']")).click();			
           Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 max pro mobile");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}

}
