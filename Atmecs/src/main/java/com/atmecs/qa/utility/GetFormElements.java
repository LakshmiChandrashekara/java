package com.atmecs.qa.utility;

public class GetFormElements {

	final String formPath = Constants.PROJECT_BASE_PATH + "/resources/locators/Form.properties";
	NavigateTo navigate = new NavigateTo();
	
	/**
	 * This method will return the Xpath for the elements to be filled
	 * @param element
	 * @return
	 */
	public String getFormElements(String element) {
		String fromElement = navigate.navigateTo(formPath, element);
		return fromElement;
	}
	
	/**
	 * The method will return the key value for the form element  
	 * @param sendKeys
	 * @return
	 */
	public String getFormElementSendKeys(String sendKeys) {
		String keyElement = navigate.navigateTo(formPath, sendKeys);
		return keyElement;
	}
}
