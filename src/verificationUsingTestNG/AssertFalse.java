package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
	 @Test
	 public void Testing()
	 {
	 boolean b=true;

	 Assert.assertFalse(b, "b is true TC is Failed");
	 }
}
