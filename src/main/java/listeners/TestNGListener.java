package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase.TestBase;
import utils.ScreenshotUtil;

public class TestNGListener implements ITestListener{
	
	static Logger log = Logger.getLogger(TestNGListener.class.getName());

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("--------------------- "+ result.getMethod().getMethodName() + " ----------------");
		log.info("Test Exectution Started for Test case : " + result.getMethod().getMethodName());
		System.out.println("onTestStart");
		System.out.println(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test case Passed : " + result.getMethod().getMethodName());
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test case Failed : " + result.getMethod().getMethodName());
		System.out.println("onTestFailure");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test case Skipped : " + result.getMethod().getMethodName());
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		log.info("Test Execution Started");
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		log.info("Test Execution Finished");
		System.out.println("onFinish");
		
	}
	
}
