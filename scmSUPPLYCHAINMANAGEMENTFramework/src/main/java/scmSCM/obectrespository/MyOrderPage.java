package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrderPage {
	
	WebDriver driver;

	public MyOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//nav//a[@href='../retailer/view_my_orders.php']")
	private WebElement myorderBtn;
	
	
	@FindBy(id="cmbFilter")
	private WebElement searchbyDD;
	
	
	@FindBy(id="txtId")
	private WebElement orderid;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement ordidsearch;
	
	@FindBy(xpath="//tbody//a[@href='view_order_items.php?id=126']")
	private WebElement selectordid;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyorderBtn() {
		return myorderBtn;
	}

	public WebElement getSearchbyDD() {
		return searchbyDD;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getOrdidsearch() {
		return ordidsearch;
	}

	public WebElement getSelectordid() {
		return selectordid;
	}
	
	

}
