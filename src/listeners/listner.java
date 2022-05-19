package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test started sucess......", true);
		ITestListener.super.onTestStart(result);
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Test Skipped please check.....", true);
		ITestListener.super.onTestSkipped(result);
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test failed...... ", true);
		ITestListener.super.onTestFailure(result);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test completed sucess.....", true);
		ITestListener.super.onTestSuccess(result);
	}
}
