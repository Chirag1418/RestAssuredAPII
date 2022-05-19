package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority_test {
	@Test 
	  public void a()  
	  {
		  
		  Reporter.log("running method a",true);
	  }
	  
	  @Test(priority=2,invocationCount=2)
	  public void b() 
	  {
		  Reporter.log("running method b",true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("running method c",true);
	  }
	  
	  @Test(priority=3)
	  public void d() 
	  {
		  Reporter.log("running method d",true);
	  }
}
