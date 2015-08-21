package training.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.UUID;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import training.core.BaseTestClass;
import training.pages.CreateProductPage;
import training.pages.ProductLoaderPage;
import training.pages.ProductViewerPage;
import training.pages.ShowRegistryPage;

public class TestProductLoaderPage extends BaseTestClass {

	private static ProductLoaderPage mProductLoaderPage;
	private static CreateProductPage mCreateProductPage;
	private static ProductViewerPage mProductViewerPage;
	private static ShowRegistryPage mShowRegistryPage;

	@BeforeClass
	public static void createPageObjectInstances() {
		mProductLoaderPage = new ProductLoaderPage(driver);
		mCreateProductPage = new CreateProductPage(driver);
		mShowRegistryPage = new ShowRegistryPage(driver);
		mProductViewerPage = new ProductViewerPage(driver);
	}

	@BeforeMethod
	public void goToCreateProductPage() {
		openUrl(mCreateProductPage.CREATE_PRODUCT_URL);
	}

	@Test
	public void testLoad10RandomPricesAreSavedCorrectly() {
		String productCode = UUID.randomUUID().toString();
		mCreateProductPage.createProduct(productCode, "description");
		mProductViewerPage.clickProductLoaderLink();
		String store = "store";

		for (int i = 0; i < 10; i++) {
			// Generate random price and convert to string
			Random randomGenerator = new Random();
			int price = randomGenerator.nextInt(100);
			String priceString = Integer.toString(price);

			// Format product name to look like is in list
			String productCodeOnList = "Bar code: " + productCode + ", Description: description";

			// Load random price on created product
			mProductLoaderPage.loadProduct(store, priceString, productCodeOnList);

			// Assert that price on Show Registry page matches price used to
			// load product
			assertEquals(priceString, mShowRegistryPage.getPriceText());
			mShowRegistryPage.clickNewRegistryLink();
		}

	}

}
