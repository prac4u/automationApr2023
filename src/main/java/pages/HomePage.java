package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	By menuItemsList = By.xpath("//ul[@class='oxd-main-menu']/li//span");

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public int getNumOfMenuItems()
	{
		List<WebElement> list = driver.findElements(menuItemsList);
		return list.size();
	}
	
	public List<String> getAllMenuItems()
	{
		List<WebElement> list = driver.findElements(menuItemsList);
		List<String> textList = new ArrayList<String>();
		
//		for(int i=0;i<list.size();i++)
//		{
//			String text = list.get(i).getText();
//			textList.add(text);
//		}
		
		
		for(WebElement e : list)
		{
			String text = e.getText();
			textList.add(text);
		}
		
		return textList;
		
	}
	
	public void clickMenu(String menuItem)
	{
		
	}
	
	


}
