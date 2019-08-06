package com.atmecs.qa.utility;
/**
 * This class contains method to generate the random number
 * @author Lakshmi.RC
 *
 */
public class GetRandomNumber {
	
	/**
	 * This method is used to generate the random numbers
	 * @param maximum
	 * @param minimum
	 * @return
	 */
	public int generateRandomNumber(int maximum, int minimum) {
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}
}
