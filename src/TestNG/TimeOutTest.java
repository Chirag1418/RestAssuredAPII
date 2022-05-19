package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutTest {
	@Test (timeOut=2000)
	  public void a() throws InterruptedException  
	  {
		 Thread.sleep(3000); 
		  Reporter.log("running method a",true);
	  }
	  
	  @Test(dependsOnMethods= {"a"})
	  public void b() 
	  {
		  Reporter.log("running method b",true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("running method c",true);
	  }
	  
	  @Test
	  public void d() 
	  {
		  Reporter.log("running method d",true);
	  }
}
