package driverfactory;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.TestNGListener;

public class DriverFactory {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(TestNGListener.class.getName());
	
	public WebDriver init_driver(String browser)
	{
		log.info("inside init_driver Method");
		log.info("Browser : " + browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch = new ChromeOptions();
			//System.out.println(System.getProperty("webdriver.chrome.driver"));
			ch.addArguments("--incognito");
			ch.addArguments("--start-maximized");
			//	ch.addArguments("--headless");
				 driver = new ChromeDriver(ch);
				 
				 log.info("Chrome browser initilized");
		}
		else if(browser.equals("edge"))
		{
		
		WebDriverManager.edgedriver().setup();		
		driver= new EdgeDriver();
		log.info("Edge browser initilised");
		}
		
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			log.info("Firefox browser initilized");
		}
		else
		{
			log.error("Please provide correct Broser name: [chrome, edge,firefox]");
			System.out.println("Please provide correct Broser name: [chrome, edge,firefox]");
			System.exit(0);
		}
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 return driver;
	}
	
}
