package com.atmecs.qa.utility;


import org.testng.Assert;

/**
 * This class contain method for validating 
 * @author Lakshmi.RC
 *
 */
public class VerifyAssertion {
	
	GenerateLoggerReport generateLog = new GenerateLoggerReport();
	
	
	/**
	 * This method is to verify the expected and actual title
	 * @param actualTitle
	 * @param expectedTitle
	 * @param message
	 */
	public void verifyAssertion(String actualTitle, String expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("PASSED: "+ message +" EXPECTED: "+ expectedTitle + " ACTUAL: "+ actualTitle);
		} catch (AssertionError assertionError) {
			System.out.println("FAILED: "+ message +" EXPECTED: "+ expectedTitle + " ACTUAL: "+ actualTitle);
		  }
	}
		
}	
		
		
