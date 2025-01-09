package Automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listn_Inter implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test start"+result.getName());
	}
		
	

	@Override
	public void onTestSuccess(ITestResult result) {
		
	System.out.println("success"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("fail"+result.getName());
	
	}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skip"+result.getHost());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestFailedButWithinSuccessPercentage"+ITestResult.SUCCESS_PERCENTAGE_FAILURE);
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout"+result.getStatus());
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("start"+context.getName());//exe only 1 time
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finish"+context.getName());
		
	}
	

}
