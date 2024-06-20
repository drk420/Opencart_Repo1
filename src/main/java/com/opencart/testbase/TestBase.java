package com.opencart.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
 
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void start() {
		logger = Logger.getLogger("Opencart Framework");
		PropertyConfigurator.configure("Log4j.propertiesfile");
		logger.info("framework execution started");
	

	}
	
	@AfterTest
	public void end() {
		logger.info("Framework ended");
	}
	
	@BeforeMethod
	public void setup() {
		String Browser = "Chrome";
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			}
		else if(Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			}
		else {
			
			logger.info("proovide correct details");
		}
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		logger.info("Browser is launched, maximized,url is launched"); 
	}
	
	
	@AfterMethod
	public void close() {
		
		driver.quit();
		logger.info("browser is clsed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
