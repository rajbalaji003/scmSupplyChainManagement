package scmSCM.Manufacturer;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import scmSCM.basetest.BaseClass;
import scmSCM.obectrespository.AddProductPage;
import scmSCM.obectrespository.LoginPage;
import scmSCM.obectrespository.ManageStockPage;


public class AddProductManageStockTest extends BaseClass {

	@Test(groups = "smokeTest")

	public void AdDProductTest() throws EncryptedDocumentException, IOException {
		
		

		String productname = elib.getDataFromExcel("addproduct", 1, 1).toString();
		String price = elib.getDataFromExcel("addproduct", 1, 2).toString();
		String description = elib.getDataFromExcel("addproduct", 1, 3).toString();

		String USERNAME = elib.getDataFromExcel("manufacturer", 1, 0).toString();
		String PASSWORD = elib.getDataFromExcel("manufacturer", 1, 1).toString();

		LoginPage lp = new LoginPage(driver);
		lp.getUsernameEdt().sendKeys(USERNAME);

		lp.getPasswordEdt().sendKeys(PASSWORD);

		wlib.select(lp.getLoginDDN(), "Manufacturer");
		lp.getLoginBtn().click();

		// click on add product

		AddProductPage ap = new AddProductPage(driver);
		ap.getAddproductBtn().click();

		// product name
		ap.getProdname().sendKeys(productname);

		// product price
		ap.getProdprice().sendKeys(price);

		// select unit
		wlib.select(ap.getProdunit(), "KG");

		// select category
		wlib.select(ap.getProdcategory(), "Fresh vegetable");

		// click enable
		ap.getEnable().click();

		// product description
		ap.getProddescript().sendKeys(description);

		// add product
		ap.getAddproductBtN().click();

		// confirmation
		wlib.alert(driver);

	}


@Test(groups = "regressionTest")

public void ManagEStockTest() throws EncryptedDocumentException, IOException {

	String textquantity = elib.getDataFromExcel("stock", 1, 1).toString();

	String USERNAME = elib.getDataFromExcel("manufacturer", 1, 0).toString();
	String PASSWORD = elib.getDataFromExcel("manufacturer", 1, 1).toString();
	LoginPage lp = new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(USERNAME);

	lp.getPasswordEdt().sendKeys(PASSWORD);

	wlib.select(lp.getLoginDDN(), "Manufacturer");
	lp.getLoginBtn().click();
	// manage stock
	ManageStockPage ms = new ManageStockPage(driver);
	ms.getManagestockBtn().click();

	wlib.scrollUsingJSE(0, 500, driver);

	ms.getQuantity().clear();
	ms.getQuantity().sendKeys(textquantity);

	// update stock
	wlib.scrolluptoELE(ms.getUpdatestockbtn(), driver);

	// confirmation
	wlib.alert(driver);

}

}
