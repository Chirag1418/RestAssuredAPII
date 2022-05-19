package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser2 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='whButtons'])[3]")).click();
		Thread.sleep(2000);
		
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		Set<String> id1 = driver.getWindowHandles();
		System.out.println(id1);
		
		Iterator<String> it = id1.iterator();
		
		String idmainpage = it.next();
		
		String idchildpage = it.next();
		
		driver.switchTo().window(idchildpage);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.id("firstName"));
		textbox.click();
		Thread.sleep(2000);
		textbox.sendKeys("chorag");

		
		//Thread.sleep(2000);
	//	driver.switchTo().window(idmainpage);
		
		//driver.findElement(By.xpath("(//button[@class='whButtons'])[3]")).click();
				Thread.sleep(2000);
			
		String id2nchild = it.next();
		driver.switchTo().window(id2nchild);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='bcCheckBox'])[6]")).click();
		
		
		
		
		
	}

}
