package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1_IncludeExclude {
  @Test
  public void rcb() 
  {
	  Reporter.log("rcb",true);
  }
  
  @Test
  public void srh() 
  {
	  Reporter.log("srh",true);
  }
  @Test
  public void mi() 
  {
	  Reporter.log("mi",true);
  }
  @Test
  public void lsg() 
  {
	  Reporter.log("lsg",true);
  }
  @Test
  public void pk() 
  {
	  Reporter.log("pk",true);
  }
}
