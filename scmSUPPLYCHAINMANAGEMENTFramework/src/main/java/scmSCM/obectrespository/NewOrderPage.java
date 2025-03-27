package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {
	
	WebDriver driver;

	public NewOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//td[@id='td_aside']//a[@href='../retailer/order_items.php']")
	private WebElement neworderBtn;
	
	@FindBy(id="271")
	private WebElement orderQuantity;
	
	
	@FindBy(xpath="//input[@value='Post Order']")
	private WebElement postorderBtn;

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getNeworderBtn() {
		return neworderBtn;
	}


	public WebElement getOrderQuantity() {
		return orderQuantity;
	}


	public WebElement getPostorderBtn() {
		return postorderBtn;
	}
	
	
	
}
