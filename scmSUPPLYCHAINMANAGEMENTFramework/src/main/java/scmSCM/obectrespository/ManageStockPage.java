package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageStockPage {
	
	WebDriver driver;

	public ManageStockPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@id='td_aside']//a[@href='../manufacturer/manage_stock.php']")
	private WebElement managestockBtn;

	
	@FindBy(name="txtQuantity[271]")
	private WebElement quantity;             
	
	@FindBy(xpath="//input[@value='Update Stock']")
	private WebElement updatestockbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManagestockBtn() {
		return managestockBtn;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getUpdatestockbtn() {
		return updatestockbtn;
	}
	
	
}
