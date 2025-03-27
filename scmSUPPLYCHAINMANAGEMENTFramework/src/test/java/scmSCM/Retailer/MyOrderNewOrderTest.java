package scmSCM.Retailer;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import scmSCM.basetest.BaseClass;
import scmSCM.obectrespository.LoginPage;
import scmSCM.obectrespository.MyOrderPage;
import scmSCM.obectrespository.NewOrderPage;

public class MyOrderNewOrderTest extends BaseClass {

	@Test(groups = "regressionTest")

	public void MyORderTest() throws EncryptedDocumentException, IOException {

		String orderID = elib.getDataFromExcel("myorder", 1, 1).toString();

		String USERNAME = elib.getDataFromExcel("retailer", 1, 0).toString();
		String PASSWORD = elib.getDataFromExcel("retailer", 1, 1).toString();

		LoginPage lp = new LoginPage(driver);
		lp.getUsernameEdt().sendKeys(USERNAME);

		lp.getPasswordEdt().sendKeys(PASSWORD);

		wlib.select(lp.getLoginDDN(), "Retailer");
		lp.getLoginBtn().click();

		// my order

		MyOrderPage mor = new MyOrderPage(driver);
		mor.getMyorderBtn().click();

		wlib.select(mor.getSearchbyDD(), "Id");

		// enter orderID
		mor.getOrderid().sendKeys(orderID);

		// search orderId
		mor.getOrdidsearch().click();

		// click on orderId

		mor.getSelectordid().click();

	}



@Test(groups = "smokeTest")

public void NeWOderTest() throws EncryptedDocumentException, IOException  {

	String neworder = elib.getDataFromExcel("order", 1, 1).toString();

	String USERNAME = elib.getDataFromExcel("retailer", 1, 0).toString();
	String PASSWORD = elib.getDataFromExcel("retailer", 1, 1).toString();

	LoginPage lp = new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(USERNAME);

	lp.getPasswordEdt().sendKeys(PASSWORD);

	wlib.select(lp.getLoginDDN(), "Retailer");
	lp.getLoginBtn().click();

	// new order
	NewOrderPage nor = new NewOrderPage(driver);
	nor.getNeworderBtn().click();

	wlib.scrollUsingJSE(0, 500, driver);

	// enter quantity
	nor.getOrderQuantity().clear();
	nor.getOrderQuantity().sendKeys(neworder);

	// post order

	wlib.scrolluptoELE(nor.getPostorderBtn(), driver);

}

}
