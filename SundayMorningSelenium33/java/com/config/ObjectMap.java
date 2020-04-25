package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {
	
	public String getconfig(String object) throws IOException {
	
	String file ="./Config.properties";//location
	FileInputStream fis = new FileInputStream(file);//serilization
	Properties properties = new Properties();
	properties.getProperty("Name");//to read notepad
	properties.load(fis);// properties & serilization connect together

	System.out.println(properties.getProperty(object));
	
	return properties.getProperty(object);
	}
 

}
