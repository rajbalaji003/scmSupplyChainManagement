package scmSCM.admin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Test;

import scmSCM.basetest.BaseClass;
import scmSCM.obectrespository.LoginPage;
import scmSCM.obectrespository.ManageAreaPage;
import scmSCM.obectrespository.ManageCategoryPage;
import scmSCM.obectrespository.ManageUnitPage;

public class ManageAreaCategoryUnitTest extends BaseClass {
	@Test(groups = "smokeTest")

	public void ManageareaTest() throws EncryptedDocumentException, IOException, InterruptedException {

		// Read test script data from excel sheet

		String area = elib.getDataFromExcel("area", 1, 1).toString();
		String areaCode = elib.getDataFromExcel("area", 1, 2).toString();
		

		String USERNAME = elib.getDataFromExcel("admin", 1, 0).toString();
		String PASSWORD = elib.getDataFromExcel("admin", 1, 1).toString();

		LoginPage lp = new LoginPage(driver);
		lp.getUsernameEdt().sendKeys(USERNAME);

		lp.getPasswordEdt().sendKeys(PASSWORD);

		wlib.select(lp.getLoginDDN(), "Admin");
		lp.getLoginBtn().click();

		// manage area
		ManageAreaPage ma = new ManageAreaPage(driver);
		ma.getManageareaBtN().click();

		wlib.scrollUsingJSE(0, 1000, driver);

		// add area

		ma.getAddareaBtN().click();

		// add areaname
		ma.getAreaname().sendKeys(area);

		// add areacode
		ma.getAreacode().sendKeys(areaCode);

		// add area submit

		ma.getAddareaSubBtN().click();

		// confirmation
		wlib.alert(driver);

	}


@Test(groups = "regressionTest")
public void ManagECategoryTest() throws EncryptedDocumentException, IOException {

	String category = elib.getDataFromExcel("category", 1, 1).toString();
	String categoryDetails = elib.getDataFromExcel("category", 1, 2).toString();

	String USERNAME = elib.getDataFromExcel("admin", 1, 0).toString();
	String PASSWORD = elib.getDataFromExcel("admin", 1, 1).toString();

	LoginPage lp = new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(USERNAME);

	lp.getPasswordEdt().sendKeys(PASSWORD);

	wlib.select(lp.getLoginDDN(), "Admin");
	lp.getLoginBtn().click();

	// manage category
	ManageCategoryPage mc = new ManageCategoryPage(driver);

	mc.getCategoryBtn().click();

	wlib.scrollUsingJSE(0, 1000, driver);

	// add category

	mc.getAddcategoryBtn().click();

	// enter category name
	mc.getCategoryname().sendKeys(category);

	// enter category details
	mc.getCategorydetails().sendKeys(categoryDetails);

	// create category

	mc.getAddcategorySubBtn().click();

	// confirmation
	wlib.alert(driver);

}


@Test(groups = "smokeTest")

public void ManagEUnitTest() throws EncryptedDocumentException, IOException {

	String unit = elib.getDataFromExcel("unit", 1, 1).toString();
	String unitDetails = elib.getDataFromExcel("unit", 1, 2).toString();

	String USERNAME = elib.getDataFromExcel("admin", 1, 0).toString();
	String PASSWORD = elib.getDataFromExcel("admin", 1, 1).toString();

	LoginPage lp = new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(USERNAME);

	lp.getPasswordEdt().sendKeys(PASSWORD);

	wlib.select(lp.getLoginDDN(), "Admin");
	lp.getLoginBtn().click();

	// manage unit

	ManageUnitPage mu = new ManageUnitPage(driver);
	mu.getManageunitBtn().click();

	wlib.scrollUsingJSE(0, 500, driver);

	// add unit
	mu.getAddunitBtn().click();

	// add unit name
	mu.getUnitname().sendKeys(unit);

	// add unit details
	mu.getUnitdetails().sendKeys(unitDetails);

	// create unit

	mu.getAddunitsubBtn().click();

	// confirmation
	wlib.alert(driver);

}

}