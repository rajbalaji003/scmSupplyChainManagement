package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
	
	WebDriver driver;

	public AddProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//aside//a[@href='../manufacturer/add_product.php']")
	private WebElement addproductBtn;
	
	@FindBy(id="product:name")
	private WebElement prodname;
	
	@FindBy(id="product:price")
	private WebElement prodprice;
	
	@FindBy(id="product:unit")
	private WebElement produnit;
	
	@FindBy(id="product:category")
	private WebElement prodcategory;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement enable;
	
	@FindBy(id="product:description")
	private WebElement proddescript;
	
	@FindBy(xpath="//input[@value='Add Product']")
	private WebElement addproductBtN;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddproductBtn() {
		return addproductBtn;
	}

	public WebElement getProdname() {
		return prodname;
	}

	public WebElement getProdprice() {
		return prodprice;
	}

	public WebElement getProdunit() {
		return produnit;
	}

	public WebElement getProdcategory() {
		return prodcategory;
	}

	public WebElement getEnable() {
		return enable;
	}

	public WebElement getProddescript() {
		return proddescript;
	}

	public WebElement getAddproductBtN() {
		return addproductBtN;
	}
	
	
	
	
	
	

}
