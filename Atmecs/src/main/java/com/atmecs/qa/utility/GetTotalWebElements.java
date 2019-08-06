package com.atmecs.qa.utility;

import org.openqa.selenium.By;
/**
 * This class contains the method for counting the total web elements in the web page
 * @author Lakshmi.RC
 *
 */

public class GetTotalWebElements {
	
	NavigateTo navigate = new NavigateTo();
	/**
	 * This method will return the number of web elements present in the specified web page
	 * @param path
	 * @param element
	 * @return
	 */
	public By getTotalWebElementsPresent(String path , String element) {
		By totalElements = By.xpath(navigate.navigateTo(path,element));
		return totalElements;
	}

}
