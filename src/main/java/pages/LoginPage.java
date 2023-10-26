package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import listeners.TestNGListener;

public class LoginPage {
	//Page Elements
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.tagName("button");
	By forgotPasswordLink = By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");
	
	By loginError = By.xpath("//p[contains(@class,'oxd-alert-content-text')]");
	
	By user = By.xpath("//div[@class='oxd-topbar-header-userarea']//p[@class='oxd-userdropdown-name']");
	static Logger log = Logger.getLogger(LoginPage.class.getName());
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Page Actions
	public void enterUsername(String user)
	{
		log.info("Entered username : " + user);
		
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		log.info("Password Entered : " + pass);
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		
		driver.findElement(loginButton).click();
		log.info("Clicked on login button");
	}
	
	public HomePage doLogin(String user, String pass)
	{
		enterUsername(user);
		enterPassword(pass);
		clickLogin();
		return new HomePage(driver);
	}
	
	
	public boolean isLoginErrorDisplayed()
	{
		try {
		 driver.findElement(loginError).isDisplayed();
		 return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	public String getLoginErrorMsg()
	{
		return driver.findElement(loginError).getText();
	}
	
	public boolean isUserDisplayed()
	{
		try {
		 driver.findElement(user).isDisplayed();
		 return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	public String getUserName()
	{
		return driver.findElement(user).getText();
	}
	
	
	public ForgotPasswordPage clickForgotPasswordLink()
	{
		driver.findElement(forgotPasswordLink).click();
		return new ForgotPasswordPage(driver);
	}
	
	
	
	

}
