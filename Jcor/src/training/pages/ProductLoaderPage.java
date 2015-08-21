package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductLoaderPage {

	WebDriver driver;

	public ProductLoaderPage(WebDriver driver) {
		this.driver = driver;
	}

	public String PRODUCT_LOADER_URL = "http://tomcat.jcor.com.ar/prizy-pricer/registry/create";

	public WebElement getProductLoaderTitle() {
		return driver.findElement(By.cssSelector("#create-registry.content.scaffold-create h1"));
	}

	public String getProductLoaderPageTitleText() {
		return getProductLoaderTitle().getText();
	}

	public WebElement getProductList() {
		return driver.findElement(By.cssSelector("#product"));
	}

	public WebElement getStoreTextBox() {
		return driver.findElement(By.id("store"));
	}

	public WebElement getPriceProduct() {
		return driver.findElement(By.id("price"));
	}

	public WebElement getCreateButon() {
		return driver.findElement(By.id("create"));
	}

	public void typeStore(String store) {
		getStoreTextBox().clear();
		getStoreTextBox().sendKeys(store);
	}

	public void typePrice(String price) {
		getPriceProduct().clear();
		getPriceProduct().sendKeys(price);
	}

	public void clickCreate() {
		getCreateButon().click();
	}

	public void selectProduct(String value) {
		Select myProductList = new Select(getProductList());
		myProductList.selectByVisibleText(value);
	}

	public void loadProduct(String store, String price, String value) {
		selectProduct(value);
		typeStore(store);
		typePrice(price);
		clickCreate();
	}

}
