package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 5)
	 public void myMethod()
	 {
	 Reporter.log("My Method is running", true);
	 }
}
