package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	public static void takeScreenshot(WebDriver driver, String filename)
	{
		String prjPath = System.getProperty("user.dir");
		System.out.println(prjPath);
		String filePath = prjPath +"\\screens\\"+filename+".png";
		System.out.println(filePath);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
