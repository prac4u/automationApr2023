package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = PropConfig.init_properties();
		System.out.println(prop.getProperty("username"));
	}

}
