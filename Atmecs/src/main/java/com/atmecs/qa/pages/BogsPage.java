package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;
/**
 * This class contain methods to interact with Blogs page web elements 
 * @author Lakshmi.RC
 *
 */
public class BogsPage {

	
	String getElementFromProperties;
	String propertiesPath;
	final String formPath = Constants.PROJECT_BASE_PATH + "/resources/locators/Form.properties";
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/Blogs.properties";
	String blogsLinkPath = Constants.PROJECT_BASE_PATH + "/resources/locators/BlogsLinks.properties";
	NavigateTo navigate = new NavigateTo();
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	
	/**
	 * This method will return the Xpath of Blogs web element
	 * @return
	 */
	public By clickBlogsPage() {
		getElementFromProperties = "blogs";
		propertiesPath = getblogsPropertiesFilePath();
		By blogsElement = By.xpath(navigate.navigateTo(propertiesPath, getElementFromProperties));
		return blogsElement;
	}
	
	/**
	 * This method will return the file path of Blogs web element
	 * @return
	 */
	public String getblogsPropertiesFilePath() {
		return path;
	}
	
	/**
	 * This method will return the file path that contains number of web elements present in Blogs page 
	 * @return
	 */
	public String getblogsLinksPropertiesFilePath() {
		return blogsLinkPath;
	}
	
	/**
	 * This method will return the randomly selected web element of Blogs page
	 * @param element
	 * @return
	 */
	public String getRandomElement(String element) {
		
		String formElement = navigate.navigateRandom(blogsLinkPath, element);
		return formElement;
	}
	
	/**
	 * This method will return the Xpath of the randomly selected web element of Blogs page
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
