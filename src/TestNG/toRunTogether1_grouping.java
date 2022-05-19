package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class toRunTogether1_grouping {
	@Test (groups="regression")
	  public void a()  
	  {
		  
		  Reporter.log("running method a",true);
	  }
	  
	  @Test (groups="sanity")
	  public void b() 
	  {
		  Reporter.log("running method b",true);
	  }
	  
	  @Test(groups="fuctional")
	  public void c() 
	  {
		  Reporter.log("running method c",true);
	  }
	  
	  @Test(groups="sanity")
	  public void d() 
	  {
		  Reporter.log("running method d",true);
	  }
}
