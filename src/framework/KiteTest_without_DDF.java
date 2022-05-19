package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest_without_DDF {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("userid")).sendKeys("HD5857");// sending username
			
			driver.findElement(By.id("password")).sendKeys("Ajinkya@123");//sending password
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on login button
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("pin")).sendKeys("969696");// sending Pin
			driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on continue button
			
			Thread.sleep(2000);
			
			String expectedUserName = "HD5857";
			
			WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
			String actualUserName = UserName.getText();
			
			if(expectedUserName.equals(actualUserName))
			{
				System.out.println("User name is matching TC is passed");
			}
			
			else {
				System.out.println("User name is not matching TC is failed");
				
			}

			Thread.sleep(2000);
			UserName.click();// clicking on username
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@target='_self']")).click();//clicking on logout button
			
			driver.close();
		}

	
			
	}


