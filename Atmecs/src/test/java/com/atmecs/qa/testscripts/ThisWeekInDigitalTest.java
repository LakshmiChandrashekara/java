package com.atmecs.qa.testscripts;


import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.atmecs.qa.pages.InsightsPage;
/**
 * This class contains test methods for ThisWeekInDigital web element
 * @author Lakshmi.RC
 *
 */
public class ThisWeekInDigitalTest {
	
	InsightsPage insightspage = new InsightsPage();
	
	/**
	 * This test method will perform the operation of instantiating the web browser
	 */
	@BeforeMethod
	public void getBrowser() {
		insightspage.openBrowser();
	}
	
	/**
	 * This test method will perform the operations regarding ThisWeekInDigital web element 
	 */
	@Test
	public void testThisWeekInDigital() {
		insightspage.thisWeekInDigital();
	}
	
	
}
