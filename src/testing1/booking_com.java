package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking_com {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='close']")).click();
		Thread.sleep(1000);
		WebElement location = driver.findElement(By.id("ss"));
		location.click();
		Thread.sleep(2000);
		location.sendKeys("Goa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(@class,'sb-date-field')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='27'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='26'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.className("xp__guests__count")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='+'])[2]")).click();
		Thread.sleep(1000);
		WebElement age = driver.findElement(By.name("age"));
		age.click();
		age.sendKeys("1");
		age.click();
		Thread.sleep(1000);
        //driver.findElement(By.className("sb-searchbox__button ")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@data-placeholder='Check-out Date']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='20'])[2]")).click();


	}

}
