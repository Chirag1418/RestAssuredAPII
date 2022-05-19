package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group2_IncludeExclude {
	 @Test
	  public void kkr() 
	  {
		  Reporter.log("kkr",true);
	  }
	  
	  @Test
	  public void rr() 
	  {
		  Reporter.log("rr",true);
	  }
	  @Test
	  public void dc() 
	  {
		  Reporter.log("dc",true);
	  }
	  @Test
	  public void gt() 
	  {
		  Reporter.log("gt",true);
	  }
	  @Test
	  public void csk() 
	  {
		  Reporter.log("csk",true);
	  }
}
