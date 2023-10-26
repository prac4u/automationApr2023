package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import listeners.TestNGListener;

public class PropConfig {
	
	public static Properties prop;
	static Logger log = Logger.getLogger(PropConfig.class.getName());
	public static Properties init_properties()
	{
		log.info("Inside init_properties Method");
		String userDir = System.getProperty("user.dir");
		
		String filePath = userDir + "\\src\\main\\java\\config\\config.properties";
		log.info("filePath : " + filePath);
		File file = new File(filePath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			 prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		log.info("Properties file initilized successfully");
		return prop;
		
	}
	
	public static Properties getProperties()
	{
		return prop;
	}

}
