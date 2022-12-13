package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertNull {
	 @Test
	 public void tesing()
	 {
	 String a="";


	 Assert.assertNull(a, "a is not null TC failed");



	 }
}
