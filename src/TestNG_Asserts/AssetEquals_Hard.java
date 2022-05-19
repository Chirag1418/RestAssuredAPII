package TestNG_Asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssetEquals_Hard {
  @Test
  public void AssertTest() 
  {
	  String name = "VCTC";
	  String name1 = "VCTC1";
	 
	  Assert.assertEquals(name, name1, "String not matching");
	 
  }
  
  @Test
  public void AssertTest1() 
  {
	  String name = "VCTC";
	  String name1 = "VCTC";
	 
	 Assert.assertNotEquals(name, name1,"Strings are matching");
	 
  }
}
