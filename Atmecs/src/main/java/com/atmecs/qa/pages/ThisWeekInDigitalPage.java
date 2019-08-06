package com.atmecs.qa.pages;

import org.openqa.selenium.By;


import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;
/**
 * This class contain methods to interact with ThisWeekInDigital page web elements 
 * @author Lakshmi.RC
 *
 */
public class ThisWeekInDigitalPage {
	
	String getElementFromProperties;
	String propertiesPath;
	final String formPath = Constants.PROJECT_BASE_PATH + "/resources/locators/Form.properties";
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/ThisWeekInDigital.properties";
	String thisWeekInDigitalLinkPath = Constants.PROJECT_BASE_PATH + "/resources/locators/ThisWeekInDigitalLinks.properties";
	NavigateTo navigate = new NavigateTo();
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	
	/**
	 * This method will return the Xpath of ThisWeekInDigitalPage web element
	 * @return
	 */
	public By clickThisWeekInDigitalPage() {
		getElementFromProperties = "thisWeekInDigital";
		propertiesPath = getThisWeekInDigitalPropertiesFilePath();
		By thisWeekinDigitalElement = By.xpath(navigate.navigateTo(propertiesPath, getElementFromProperties));
		return thisWeekinDigitalElement;
	}
	

	/**
	 * This method will return the file path of ThisWeekInDigital web element
	 * @return
	 */
	public String getThisWeekInDigitalPropertiesFilePath() {
		return path;
	}
	
	/**
	 * This method will return the file path that contains number of web elements present in ThisWeekInDigital page
	 * @return
	 */
	public String getThisWeekInDigitalLinksPropertiesFilePath() {
		return thisWeekInDigitalLinkPath;
	}
	
	/**
	 * This method will return the randomly selected web element of ThisWeekInDigital page
	 * @param number
	 * @return
	 */
	public String getRandomElement(String number) {
		
		String element = navigate.navigateRandom(thisWeekInDigitalLinkPath, number);
		return element;
	}
	
	/**
	 * This method will return the Xpath of the randomly selected web element of ThisWeekInDigital page
	 * @param number
	 * @return
	 */
	public By getRandomElementXpath(String number) {
		By randomXpath= By.xpath(navigate.navigateRandom(path, number));
		return randomXpath;
	}

//	/**
//	 * This method will return the Xpath for the elements to be filled
//	 * @param element
//	 * @return
//	 */
//	public String getFormElements(String element) {
//		String fromElement = navigate.navigateTo(formPath, element);
//		return fromElement;
//	}
//	
//	/**
//	 * The method will return the key value for the form element  
//	 * @param sendKeys
//	 * @return
//	 */
//	public String getFormElementSendKeys(String sendKeys) {
//		String keyElement = navigate.navigateTo(formPath, sendKeys);
//		return keyElement;
//	}
}
