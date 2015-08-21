package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShowRegistryPage {
	
	WebDriver driver;
	
	public ShowRegistryPage(WebDriver driver){
		this.driver = driver;
	}
	
	// Get Elements
	private WebElement getPriceElement(){
		return driver.findElement(By.cssSelector("li.fieldcontain:nth-child(3) > span:nth-child(2)"));
	}
	
	private WebElement getNewRegistryElement(){
		return driver.findElement(By.cssSelector(".create"));
	}
	
	
	// Get Text from elements
	public String getPriceText(){
		return getPriceElement().getText();
	}
	
	// Page features
	public void clickNewRegistryLink(){
		getNewRegistryElement().click();
	}
	
	
}
