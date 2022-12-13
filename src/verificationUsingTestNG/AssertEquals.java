package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertEquals {
	 @Test
	 public void testing()
	 {

	 String a="Pune";
	 String b="Pune1";

	 //if both are same (equal) then TC should be pass

Assert.assertEquals(a,b ,"a and b are not matching TC failed");

	 }
}
