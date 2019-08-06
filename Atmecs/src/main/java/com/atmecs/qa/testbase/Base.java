package com.atmecs.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.atmecs.qa.utility.Constants;
/**
 * This class contains methods to interact with different kinds of web browser
 * @author Lakshmi.RC
 *
 */
public class Base {
	
	public WebDriver driver;
	/**
	 * This method will return the object of the specified properties file
	 * @param path
	 * @return
	 */
	public Properties readProperties(String path) {
		
		Properties properties = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream(path);
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return properties;
	}

	/**
	 * This method will instantiate the object of specified browser
	 */
	public void openBrowser() {
		String path = Constants.PROJECT_BASE_PATH + "/resources/Config.properties";
		Properties prop = readProperties(path);
		String chromePath = Constants.PROJECT_BASE_PATH+prop.getProperty("ChromeDriverPath");
		String firefoxPath = Constants.PROJECT_BASE_PATH+prop.getProperty("FirefoxDriverPath");
		String internetExplorerPath = Constants.PROJECT_BASE_PATH+prop.getProperty("IEDriverPath");
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",chromePath);
			driver = new ChromeDriver();
		} 
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",firefoxPath);
			driver = new FirefoxDriver();
		}

		else if (prop.getProperty("browser").equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver",internetExplorerPath);
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}
	
	/**
	 * This method will perform the operation of quiting the browser window
	 */
	public void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
	}
	
	
	
}
