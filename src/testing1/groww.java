package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class groww {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\selenium-java-4.1.2\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://groww.in/");
		
		  WebElement username = driver.findElement(By.xpath("//input[contains(@class,'txtinput88')]"));
		Thread.sleep(2000);
		username.sendKeys("chirag");
		
		Thread.sleep(2000);
		
		username.clear();
		
		username.click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='hpd21MainText']")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		Thread.sleep(2000);
		driver.navigate().back();
		
		String text2 = driver.findElement(By.xpath("//span[text()='Login/Register']")).getText();
		
		
		
		if(text.equals(text2))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
		System.out.println(text2);
		

	}

}
