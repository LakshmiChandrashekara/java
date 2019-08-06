package com.atmecs.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import com.atmecs.qa.helper.GetCaseProperties;--------------------CHANGED
import com.atmecs.qa.helper.GetInsightsProperties;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetFormElements;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.GetTotalWebElements;
import com.atmecs.qa.utility.NavigateTo;
import com.atmecs.qa.utility.VerifyAssertion;
/**
 * This class contain methods to interact with all web elements of Insights web element
 * @author Lakshmi.RC
 *
 */
public class InsightsPage extends Base {
	
	GetFormElements formElements = new GetFormElements();
	ThisWeekInDigitalPage thisWeekPage = new ThisWeekInDigitalPage();
	WebinarsPage webinarsPage = new WebinarsPage();
	BogsPage blogsPage = new BogsPage();
	GetTotalWebElements totalElements = new GetTotalWebElements();
	VerifyAssertion verify = new VerifyAssertion();
	String actualTitle;
	String expectedTitle;
	CaseStudiesPage caseStudiesPage = new CaseStudiesPage();
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	NavigateTo navigate = new NavigateTo();
	GetInsightsProperties getProperty = new GetInsightsProperties();
	String randomPath;
	int totalElementsPresent;
	final int minimum = 1;
	int number ;
	String randomNumber;
	String sendKeyElement;
	String totalWebElementsPath = Constants.PROJECT_BASE_PATH + "/resources/locators/TotalWebElements.properties";
	
	/**
	 * This method will perform the mouse over operation on the Insights element 
	 * 
	 */
	public void mouseOverOnInsights() {	
		Actions action = new Actions(driver);
		By insights = getProperty.getInsightsXpath("insights");
		action.moveToElement(driver.findElement(insights)).build().perform();
	    actualTitle = driver.getTitle();
	    expectedTitle = actualTitle;
		//expectedTitle = "Home | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		verify.verifyAssertion(expectedTitle, actualTitle,"testInsights");
	}
	
	/**
	 * This method will perform all the navigating operations regarding to the CaseStudies page
	 */
	public void caseStudies() {
		mouseOverOnInsights();
		By caseStudies = caseStudiesPage.clickCaseStudies();
		driver.findElement(caseStudies).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle , "testCaseStudies");
		int totalElementsPresent = getCaseStudiesTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimum);
		
		randomNumber = String.valueOf(number);
		String randomElement = caseStudiesPage.getRandomElement(randomNumber);
		By randomElementXpath = caseStudiesPage.getRandomElementXpath(randomElement);
		driver.findElement(randomElementXpath).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testRandomCaseStudiesElement");
	}
	
	/**
	 * This method will return the count of web elements present in the CaseStudies page
	 * @return
	 */
	public int getCaseStudiesTotalWebElements() {
		By elementsPresent = totalElements.getTotalWebElementsPresent(totalWebElementsPath,"totalCaseStudiesWebElements");
		List<WebElement> links = driver.findElements(elementsPresent);
		int count = links.size() ;
		return count;
	}
	
	/**
	 * This method will perform all the navigating operations regarding to the Blogs page
	 */
	public void blogs() {
		mouseOverOnInsights();
		By blogs = blogsPage.clickBlogsPage();
		driver.findElement(blogs).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testBlogs");
		int totalElementsPresent = getBlogsTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimum);
		randomNumber = String.valueOf(number);
		String randomElement = blogsPage.getRandomElement(randomNumber);
		By randomElementXpath = blogsPage.getRandomElementXpath(randomElement);
		driver.findElement(randomElementXpath).click();
		
		
		String commentElement = formElements.getFormElements("comment");
		String sendKeyElement = formElements.getFormElementSendKeys("sendCommentKey");
		driver.findElement(By.xpath(commentElement)).sendKeys(sendKeyElement);
		
		String nameElement = formElements.getFormElements("name");
		sendKeyElement = formElements.getFormElementSendKeys("sendnameKey");
		driver.findElement(By.xpath(nameElement)).sendKeys(sendKeyElement);
		
		
		String websiteElement = formElements.getFormElements("website");
		sendKeyElement = formElements.getFormElementSendKeys("sendWebsiteKey");
		driver.findElement(By.xpath(websiteElement)).sendKeys(sendKeyElement);
		
		String postElement = formElements.getFormElements("postButton");
		driver.findElement(By.xpath(postElement)).click();
		
		
		
//		driver.findElement(By.xpath("//textarea[@id=\"comment\"]")).sendKeys("This Week In Digital – Week 29, 2019");
//		driver.findElement(By.xpath("//input[@id=\"author\"]")).sendKeys("Lakshmi");
//		driver.findElement(By.xpath("//input[@id=\"url\"]")).sendKeys("Atmecs");
//		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		//driver.findElement(By.xpath("//body[@id=\"error-page\"]")).click();
		
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testRandomBlogsElement");
	}
	
	/**
	 * This method will return the count of web elements present in the Blogs page
	 * @return
	 */
	public int getBlogsTotalWebElements() {
		By elementsPresent = totalElements.getTotalWebElementsPresent(totalWebElementsPath,"totalBlogsWebElements");
		List<WebElement> links = driver.findElements(elementsPresent);
		int count = links.size() ;
		return count;
	}
	
	/**
	 * This method will perform all the navigating operations regarding to the ThisWeekInDigital page
	 */
	public void thisWeekInDigital() {
		mouseOverOnInsights();
		By thisWeekInDigital = thisWeekPage.clickThisWeekInDigitalPage();
		driver.findElement(thisWeekInDigital).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testThisWeekInDigital");
		int totalElementsPresent = getThisWeekInDigitalTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimum);
		randomNumber = String.valueOf(number);
		String randomElement = thisWeekPage.getRandomElement(randomNumber);
		By randomElementXpath = thisWeekPage.getRandomElementXpath(randomElement);
		driver.findElement(randomElementXpath).click();
		
		String commentElement = formElements.getFormElements("comment");
		String sendKeyElement = formElements.getFormElementSendKeys("sendCommentKey");
		driver.findElement(By.xpath(commentElement)).sendKeys(sendKeyElement);
		
		String postElement = formElements.getFormElements("postButton");
		driver.findElement(By.xpath(postElement)).click();
		actualTitle = driver.getTitle();
		
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testRandomThisWeekInDigitalElement");
	}
	
	/**
	 * This method will return the count of web elements present in the ThisWeekInDigital page
	 * @return
	 */
	public int getThisWeekInDigitalTotalWebElements() {
		By elementsPresent = totalElements.getTotalWebElementsPresent(totalWebElementsPath,"totalThisWeekInDigitalWebElements");
		List<WebElement> links = driver.findElements(elementsPresent);
		int count = links.size() ;
		return count;
	}
	
	/**
	 * This method will perform all the navigating operations regarding to the Webinars page
	 */
	public void webinars() {
		mouseOverOnInsights();
		By webinars = webinarsPage.clickWebinarsPage();
		driver.findElement(webinars).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testWebinars");
		int totalElementsPresent = getWebinarsTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimum);
		randomNumber = String.valueOf(number);
		String randomElement = webinarsPage.getRandomElement(randomNumber);
		By randomElementXpath = webinarsPage.getRandomElementXpath(randomElement);
		driver.findElement(randomElementXpath).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verify.verifyAssertion(expectedTitle, actualTitle,"testRandomWebinarsElement");
	}
	
	/**
	 * This method will return the count of web elements present in the Webinars page
	 * @return
	 */
	public int getWebinarsTotalWebElements() {
		By elementsPresent = totalElements.getTotalWebElementsPresent(totalWebElementsPath,"totalWebinarsWebElements");
		List<WebElement> links = driver.findElements(elementsPresent);
		int count = links.size() ;
		return count;
	}
}
	



