
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	By forgotPasswordPageTitle = By.xpath("//h6[contains(@class,'orangehrm-forgot-password-title')]");
	By forgotPasswordUsename = By.name("username");
	By resetButton = By.xpath("//button[contains(@class,'orangehrm-forgot-password-button--reset')]");
	
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String getForgotPasswordPageTitle()
	{
		return driver.findElement(forgotPasswordPageTitle).getText();
	}
	
	public void enterForgotPaswordUsername(String user)
	{
		driver.findElement(forgotPasswordUsename).sendKeys(user);
	}
	
	public void clickResetPassword()
	{
		driver.findElement(resetButton).click();
	}
	

}
