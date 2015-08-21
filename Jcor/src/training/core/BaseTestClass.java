package training.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass{
	
	
	public static WebDriver driver;
		
	public WebDriver getDriver(){
		return driver;
	}
	
	@BeforeSuite
	public static void setUp(){
		driver = new FirefoxDriver();
	}
	
	public void openUrl(String url){
		driver.get(url);
	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}