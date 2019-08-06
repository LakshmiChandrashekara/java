package com.atmecs.qa.utility;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class GenerateLoggerReport {

	Logger log;
	String logpath = Constants.PROJECT_BASE_PATH + "/resources/log4j/log4j.properties";
	
	public GenerateLoggerReport() {
	log = Logger.getLogger(GenerateLoggerReport.class);
	getloggerConfig();
	}
	
	public void getloggerConfig() {
		PropertyConfigurator.configure(logpath);
		}
	
	public void printLog(String message) {
		log.info(message);
	}
}


//public class LogReports {
//
//Logger logger = null;
//
//public LogReports() {
//getlogger();
//logger = Logger.getLogger(LogReports.class.getName());
//}
//
//public void getlogger() {
//PropertyConfigurator.configure(logpath);
//}
//
//public void info(String message) {
//logger.info(message);
//}
//}