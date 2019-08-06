 package com.atmecs.qa.pages;

import org.openqa.selenium.By;


import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;
/**
 * This class contain methods to interact with Webinars page web elements 
 * @author Lakshmi.RC
 *
 */
public class WebinarsPage {
	
	String getElementFromProperties;
	String propertiesPath;
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/Webinars.properties";
	String webinarsLinkPath = Constants.PROJECT_BASE_PATH + "/resources/locators/WebinarsLinks.properties";
	NavigateTo navigate = new NavigateTo();
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	
	/**
	 * This method will return the Xpath of Webinars web element
	 * @return
	 */
	public By clickWebinarsPage() {
		getElementFromProperties = "webinars";
		propertiesPath = getWebinarsPropertiesFilePath();
		By blogsElement = By.xpath(navigate.navigateTo(propertiesPath, getElementFromProperties));
		return blogsElement;
	}
	
	/**
	 * This method will return the file path of Webinars web element
	 * @return
	 */
	public String getWebinarsPropertiesFilePath() {
		return path;
	}
	
	/**
	 * This method will return the file path that contains number of web elements present in Webinars page
	 * @return
	 */
	public String getWebinarsLinksPropertiesFilePath() {
		return webinarsLinkPath;
	}
	
	/**
	 * This method will return the randomly selected web element of Webinars page
	 * @param number
	 * @return
	 */
	public String getRandomElement(String number) {
		String element = navigate.navigateRandom(webinarsLinkPath, number);
		return element;
	}
	
	/**
	 * This method will return the Xpath of the randomly selected web element of Webinars page
	 * @param number
	 * @return
	 */
	public By getRandomElementXpath(String number) {
		By randomXpath= By.xpath(navigate.navigateRandom(path, number));
		return randomXpath;
	}

}
