package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	public static final String HOME_PAGE_URL = "http://tomcat.jcor.com.ar/prizy-pricer/";
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getCreateNewProductOption(){
		//WebElement controllerList = driver.findElement(By.cssSelector("#controller-list"));
		return driver.findElement(By.cssSelector("[href='/prizy-pricer/product/create']"));
	}
	
	public void clickCreateNewProductOption(){
		getCreateNewProductOption().click();
	}

}
