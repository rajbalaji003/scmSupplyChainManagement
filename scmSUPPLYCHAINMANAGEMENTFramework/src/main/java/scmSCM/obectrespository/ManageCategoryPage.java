package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryPage {
	
	WebDriver driver;
	public ManageCategoryPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
		
   @FindBy(xpath="//td[@id='td_aside']//a[@href='../admin/view_category.php']")
   private WebElement categoryBtn;
   
   @FindBy(xpath="//a[@href='add_category.php']//input[@class='submit_button']")
   private WebElement addcategoryBtn;
   
   @FindBy(id="categoryName")
   private WebElement categoryname;
   
   @FindBy(id="categoryDetails")
   private WebElement categorydetails;
   
   @FindBy(xpath="//input[@value='Add Category']")
   private WebElement addcategorySubBtn;
   
public WebDriver getDriver() {
	return driver;
}

public WebElement getCategoryBtn() {
	return categoryBtn;
}

public WebElement getAddcategoryBtn() {
	return addcategoryBtn;
}

public WebElement getCategoryname() {
	return categoryname;
}

public WebElement getCategorydetails() {
	return categorydetails;
}

public WebElement getAddcategorySubBtn() {
	return addcategorySubBtn;
}
   
   
}   
   

