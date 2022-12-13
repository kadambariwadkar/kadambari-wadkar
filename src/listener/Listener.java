package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener  implements ITestListener
 {
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("TC failed please try again...", true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
	Reporter.log("TC success...", true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
	Reporter.log("TC is skipped please check", true);
	}
}
