package iframe_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hotstar.com/in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		RandomString str=new RandomString(4);
		Thread.sleep(5000);

		File destination=new File("C:\\Users\\admin\\Desktop\\Vel auto notes\\Screenshot\\testscreenshot"+str+".png");
		
		FileHandler.copy(source, destination);
	}

}
