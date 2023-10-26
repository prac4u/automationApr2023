package testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import driverfactory.DriverFactory;
import pages.HomePage;
import pages.LoginPage;
import utils.PropConfig;
import utils.ScreenshotUtil;

public class TestBase {

	protected  WebDriver driver;
	protected static Properties prop;

	
	@BeforeTest
	public void test()
	{
		System.out.println("Test Execution Started....");
		prop = PropConfig.init_properties();
	}
	
	@BeforeMethod
	public void before()
	{
		DriverFactory df = new DriverFactory();
		driver=df.init_driver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	

	@AfterMethod
	public void after(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtil.takeScreenshot(driver, result.getMethod().getMethodName());
		}
		driver.quit();
	}
}
