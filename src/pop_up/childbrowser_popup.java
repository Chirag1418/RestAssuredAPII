package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();		
		//String idofMainPage = driver.getWindowHandle();
		
		//System.out.println("id of main page is" +idofMainPage);
		
		Set<String> allids = driver.getWindowHandles();
		
		System.out.println(allids);
		
		Iterator<String> it = allids.iterator();
		
		
		String idofMainPage1 = it.next();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String idofchildpage = it.next();
		
		driver.switchTo().window(idofchildpage);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("chorafag");
		
		
		Thread.sleep(2000);
		
		driver.switchTo().window(idofMainPage1);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();		
		//String idofMainPage = driver.getWindowHandle();
		
		String idofchild2 = it.next();
		Thread.sleep(2000);
		driver.switchTo().window(idofchild2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Seleniumnew");
		
		
		
		

	}

}
