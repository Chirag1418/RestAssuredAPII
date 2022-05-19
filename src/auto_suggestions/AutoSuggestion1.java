package auto_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
          search.click();
          search.sendKeys("honda");
          
         List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
         
         System.out.println(searchResults.size());
         
         for(WebElement o:searchResults)
         {
        	 System.out.println(o.getText());
     		Thread.sleep(2000);
     		
     		if(o.getText().equals("honda amaze"))
     		{
     			o.click();
     			break;
     		}

        	 
         }
  		Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@data-hveid='CAIQAw']")).click();
	}

}
