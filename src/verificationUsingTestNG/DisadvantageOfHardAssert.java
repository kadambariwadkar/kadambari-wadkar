package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAssert {
	 @Test
	 public void tesing()
	 {

	 String a=null;
	 String b=null;

	 //if both are not equal and b is not null then TC should be pass

	 Assert.assertNotEquals(a, b,"a and b are equals TC is failed ");
	 Assert.assertNotNull(b, "b is null TC is failed");

	 }

}
