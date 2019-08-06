package com.atmecs.qa.helper;

import org.openqa.selenium.By;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.NavigateTo;

public class GetInsightsProperties {
	
	
	NavigateTo navigate = new NavigateTo();
	
	/**
	 * This method will return the Xpath of the Insights web element
	 * @param Element
	 * @return
	 */
	public By getInsightsXpath(String Element) {
		String caseStudiesFilePath = getPropertiesFilePath();
		By getInsights = By.xpath(navigate.navigateTo(caseStudiesFilePath, Element));
		return getInsights;
	}
	
	/**
	 * This method will return the file path of the Insights web element
	 * @return
	 */
	public String getPropertiesFilePath() {
		String path = Constants.PROJECT_BASE_PATH + "/resources/locators/Insights.properties";
		return path;
	}
	
	
}
