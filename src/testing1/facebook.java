package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chiraglotlikar@yahoo.in");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Fukreyaitd@123");
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@style='background-image: url(\"https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/QnBF2xVFFiX.png\"); background-position: 0px -46px; background-size: auto; width: 20px; height: 20px; background-repeat: no-repeat; display: inline-block;']")).click();


		



		
		
	}

}
