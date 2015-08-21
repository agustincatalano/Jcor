package training.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import training.core.BaseTestClass;
import training.pages.CreateProductPage;
import training.pages.HomePage;

public class TestHomePage extends BaseTestClass {

	private HomePage mHomePage;
	private CreateProductPage mCreateProductPage;

	@BeforeClass
	private void createObjectInstances() {
		mHomePage = new HomePage(driver);
		mCreateProductPage = new CreateProductPage(driver);
	}

	@BeforeClass
	public void openPage() {
		openUrl(mHomePage.HOME_PAGE_URL);
	}

	@Test
	public void testCreateNewProductLink() {
		mHomePage.clickCreateNewProductOption();
		assertEquals("Create Product",
				mCreateProductPage.getCreateProductPageTitleText());
	}

}
