package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;
/**
 * This class contain methods to interact with CaseStudies page web elements 
 * @author Lakshmi.RC
 *
 */
public class CaseStudiesPage {
	
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	String getElementFromProperties;
	String propertiesPath;
	NavigateTo navigate = new NavigateTo();
	int totalElementsPresent;
	final int minimumNumber = 1; 
	int number;
	String randomNumber ;
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudies.properties";
	String caseStuidiesLinkPath = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudiesLink.properties";
	
	/**
	 * This method will return the Xpath of CaseStudies web element
	 * @return
	 */
	public By clickCaseStudies() {
		getElementFromProperties = "CaseStudies";
		propertiesPath = getCasePropertiesFilePath();
		By caseStudiedElement = By.xpath(navigate.navigateTo(propertiesPath, getElementFromProperties));
		return caseStudiedElement;
	}
	
	/**
	 * This method will return the file path of CaseStudies web element
	 * @return
	 */
	public String getCasePropertiesFilePath() {
		return path;
	}
	
	/**
	 * This method will return the file path that contains number of web elements present in CaseStudies page
	 * @return
	 */
	public String getCaseLinkPropertiesFilePath() {
		return caseStuidiesLinkPath;
	}
	
	/**
	 * This method will return the randomly selected web element of CaseStudies page
	 * @param number
	 * @return
	 */
	public String getRandomElement(String number) {
		
		String element = navigate.navigateRandom(caseStuidiesLinkPath, number);
		return element;
	}
	
	/**
	 * This method will return the Xpath of the randomly selected web element of CaseStudies page
	 * @param number
	 * @return
	 */
	public By getRandomElementXpath(String number) {
		By randomXpath= By.xpath(navigate.navigateRandom(path, number));
		return randomXpath;
	}
}
