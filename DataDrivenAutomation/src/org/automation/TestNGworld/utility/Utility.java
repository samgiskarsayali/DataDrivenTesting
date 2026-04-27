package org.automation.TestNGworld.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Utility {
	
	//making it static bcz it is going to get used from multiple places.
	public static Object fetchProperty(String key) throws IOException {
		
		//To make connection with the file, use FileInputStream
		FileInputStream file = new FileInputStream("./Config/config.properties");
		
		//To read data from the config.properties file.
		Properties property = new Properties();
		
		property.load(file); //To load the file.
		
		//browserName=chrome is a 
		//key=value format 
		return property.get(key); //get browserName or applicationURL which will be passed in method name.
		
		
		
	
		
	}
	

}
