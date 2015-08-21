package training.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class CreateProductPage {
		
	WebDriver driver;
	
	public CreateProductPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	// Mapping 
	public static final String CREATE_PRODUCT_URL = "http://tomcat.jcor.com.ar/prizy-pricer/product/create";
	
	public WebElement getBarCodeTextBox(){
		return driver.findElement(By.cssSelector("#barCode"));
	}
	
	public WebElement getDescriptionTextBox(){
		return driver.findElement(By.cssSelector("#description"));
	}
	
	public WebElement getCreateButton(){
		return driver.findElement(By.cssSelector("#create"));
	}
	
	public WebElement getHomeButton(){
		return driver.findElement(By.cssSelector("li .home"));
	}
	
	public WebElement getProductListButton(){
		return driver.findElement(By.cssSelector("li .list"));
	}
	
	private WebElement getCreateProductPageTitle(){
		return driver.findElement(By.cssSelector("#create-product > h1:nth-child(1)"));
	}

	

	public void typeBarCode(String code){

		getBarCodeTextBox().clear();
		getBarCodeTextBox().sendKeys(code);
	}

	public void typeDescription(String description){
		getDescriptionTextBox().clear();
		getDescriptionTextBox().sendKeys(description);
	}
	
	public void clickCreateButton(){
		getCreateButton().click();
	}
	
	public void createProduct(String code, String description){
		typeDescription(description);
		typeBarCode(code);
		clickCreateButton();
	}


	public String copyCodeProduct(){
		String codeActualProduct = "";
		WebElement bardoceText = getBarCodeTextBox();
	    codeActualProduct = bardoceText.getAttribute("value");
	    return codeActualProduct;
	}
	
	public String copyDescriptionProduct(){
		String descriptionActualProduct ="";
		WebElement descriptionText = getDescriptionTextBox();
		descriptionActualProduct = descriptionText.getAttribute("value");
		return descriptionActualProduct;
	}

	
	public String getCreateProductPageTitleText(){
		return getCreateProductPageTitle().getText();
	}

}
