package iframe_screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class i_frame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
		
		Thread.sleep(1000);
		
		//driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.xpath("//a[contains(text(),'best software')]")).click();
		
		driver.switchTo().defaultContent();
	}

}
