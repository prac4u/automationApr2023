package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import utils.Constants;

public class HomePageTest extends TestBase{
	
	@Test()
	public void test_menuItems()
	{
		LoginPage lp = new LoginPage(driver);
		lp.doLogin("Admin", "admin123");
		HomePage hp = new HomePage(driver);
		
		Assert.assertEquals(hp.getNumOfMenuItems(), 12);
		
		Assert.assertEquals(hp.getAllMenuItems(), Constants.MENU_ITEMS);
	}
	
	

}
