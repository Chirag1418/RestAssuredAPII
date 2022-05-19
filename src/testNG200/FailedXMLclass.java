package testNG200;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXMLclass {
	@Test(timeOut=1000)
	  public void a() throws InterruptedException 
	  {
		  Reporter.log("Test a running",true);
		  Thread.sleep(2000);
	  }
	  
	  @Test
	  public void b() 
	  {
		  Reporter.log("Test b running",true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("Test c running",true);
	  }
	  
	  @Test
	  public void d() 
	  {
		  Reporter.log("Test d running",true);
	  }
}
