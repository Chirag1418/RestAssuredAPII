package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.listner.class)
public class testing {
 
  
	  @Test
	  public void a()
	  {
		  Reporter.log("Running TC a", true);
	  }
	  @Test
	  public void b()
	  {
		  Assert.fail();
		  Reporter.log("Running TC b",true);
	  }
	  
	  @Test(dependsOnMethods = {"b"})
	  public void c()
	  {
		  Reporter.log("Running TC c",true);
	  }
  
}
