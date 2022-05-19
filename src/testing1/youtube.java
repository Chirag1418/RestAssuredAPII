package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\selenium-java-4.1.2\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Aashiqui aa gayi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/c-NaCU2n8jg/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBzL6TMXHgAmB-d_EUWqaoTGAXHBQ']']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/c-NaCU2n8jg/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBzL6TMXHgAmB-d_EUWqaoTGAXHBQ']']")).click();
		//Thread.sleep(2000);
        //driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Aashiqui Aa Gayi Song | Radhe Shyam | Prabhas, Pooja Hegde | Mithoon, Arijit Singh | Bhushan K by T-Series 2 months ago 3 minutes, 13 seconds 85,885,392 views']")).click();
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/c-NaCU2n8jg/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBzL6TMXHgAmB-d_EUWqaoTGAXHBQ']")).click();

		




	}

}
