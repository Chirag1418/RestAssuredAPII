package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='KPnG0']")).click();
         driver.findElement(By.className("KPnG0")).click();
         driver.findElement(By.name("email")).sendKeys("chirag lotlikar");
         driver.findElement(By.id("pass")).sendKeys("iamreborn");

	}

}
