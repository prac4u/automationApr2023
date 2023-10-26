package tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import listeners.TestNGListener;
import pages.LoginPage;
import testbase.TestBase;
import utils.Constants;

public class LoginTest extends TestBase{
	
	static Logger log = Logger.getLogger(LoginTest.class.getName());
	@Test
	public void valid_test()
	{
		LoginPage page = new LoginPage(driver);
		page.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals(page.isUserDisplayed(), true, "Home page is not displayed");
		
		log.info("Expected user : " + prop.get("user"));
		log.info("Actual user : " + page.getUserName());
		Assert.assertEquals(page.getUserName(), prop.get("user"));
	}
	
	@Test
	public void Invalid_Login_test()
	{
		//open browser
		//launch url
		//go to login page
		//enter invalid username password
		//click on login button
		//verify "invalid credentials" msg displayed
		
		LoginPage page = new LoginPage(driver);
		page.doLogin("test", "test");
		
		//element should be displayed
		Assert.assertEquals(page.isLoginErrorDisplayed(), true, "Login error is not displayed");
		
		//element text should be equal to "Invalid credentials"
		Assert.assertEquals(page.getLoginErrorMsg(), Constants.INVALID_CREDENTIALS_LOGIN);
	}
	
	
	

	

}
