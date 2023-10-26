package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ForgotPasswordPage;
import pages.LoginPage;
import testbase.TestBase;
import utils.Constants;

public class ForgotPasswordTest extends TestBase {
	

	@Test
	public void forgotPaswordTest()
	{
		//open browser
		//launch url
		//click on forgotpassword link
		//enter username
		//click on reset button
		//verify title
		

		LoginPage lp = new LoginPage(driver);
		//lp.clickForgotPasswordLink();
		
		ForgotPasswordPage fp = lp.clickForgotPasswordLink();
		
		Assert.assertEquals(fp.getForgotPasswordPageTitle(), Constants.FORGOT_PASSWORD_TITLE);
		
		fp.enterForgotPaswordUsername("test");
		fp.clickResetPassword();
		Assert.assertEquals(fp.getForgotPasswordPageTitle(), Constants.FORGOT_PASSWORD_SUCCESS_MSG);
		
	}


}
