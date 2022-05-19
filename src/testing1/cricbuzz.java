package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@class,'cb-mat-mnu-itm cb-ovr-flo')][3]")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Ishan Kishan')]")).click();
        driver.findElement(By.xpath("//a[text()='Full profile']")).click();
        driver.findElement(By.xpath("//a[@class='cb-hm-mnu-itm'][1]")).click();
	}

}
