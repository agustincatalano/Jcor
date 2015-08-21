package training.pages;

import org.testng.AssertJUnit;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductViewerPage {
	WebDriver driver;

	// Class constructor
	public ProductViewerPage(WebDriver driver){
		this.driver = driver;
	}
	
	// Get WebElements
	public WebElement getBarCodeElement(){
		return driver.findElement(By.cssSelector("li.fieldcontain:nth-child(1) > span:nth-child(2)"));
	}
		
	public WebElement getDescriptionElement(){
		return driver.findElement(By.cssSelector("li.fieldcontain:nth-child(2) > span:nth-child(2)"));
	}
		
	public WebElement getProductViewerTitle(){
		return driver.findElement(By.cssSelector("#show-product > h1:nth-child(1)"));
	}
	
	public WebElement getProductLoaderElement(){
		return driver.findElement(By.cssSelector(".nav > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
	}
	
	// Get text from Web Elements
	public String getBarCodeText(){
		return getBarCodeElement().getText();
	}
	
	public String getDescriptionText(){
		return getDescriptionElement().getText();
	}
	
	public String getProductViewerTitleText(){
		return getProductViewerTitle().getText();
	}
	
	// Features
	public void clickProductLoaderLink(){
		getProductLoaderElement().click();
	}
	


	
	
	
	
}
