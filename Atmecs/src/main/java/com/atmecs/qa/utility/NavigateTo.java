package com.atmecs.qa.utility;

import java.util.Properties;
import com.atmecs.qa.testbase.Base;
/**
 * This class contain method for navigating 
 * @author Lakshmi.RC
 *
 */
public class NavigateTo {

	Base base = new Base();
	String elementFromPropertiesFile;
	Properties properties;
	
	/**
	 * This method will return the specified element from properties file
	 * @param propertiesFilePath
	 * @param webElement
	 * @return
	 */
	public String navigateTo(String propertiesFilePath, String  webElement) {
		properties = base.readProperties(propertiesFilePath);
		elementFromPropertiesFile = properties.getProperty(webElement);
		return elementFromPropertiesFile;
	}
	
	/**
	 * This method will return the random element from properties file
	 * @param propertiesFilePath
	 * @param webElement
	 * @return
	 */
	public String navigateRandom(String propertiesFilePath, String  webElement) {
		String randomNumberElement = navigateTo(propertiesFilePath,webElement);
		return randomNumberElement;
	}
}
