package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_NotNull {
  @Test
  public void f() 
  {
	  String a="VCTC";
	  
	  Assert.assertNull(a, "a is not Null");
  }
  
  @Test
  public void f1() 
  {
	  String a=null;
	  
	  Assert.assertNull(a, "a is Null");
  }
  
  
}
