package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class toRunTogether2_grouping {
	@Test (groups="regression")
	  public void e()  
	  {
		  
		  Reporter.log("running method e",true);
	  }
	  
	  @Test(groups="regression")
	  public void f() 
	  {
		  Reporter.log("running method f",true);
	  }
	  
	  @Test(groups="regression")
	  public void g() 
	  {
		  Reporter.log("running method g",true);
	  }
	  
	  @Test(groups="sanity")
	  public void h() 
	  {
		  Reporter.log("running method h",true);
	  }
}
