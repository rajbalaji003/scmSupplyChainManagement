package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUnitPage {
	
WebDriver driver;

public ManageUnitPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	

@FindBy(xpath="//td[@id='td_aside']//a[@href='../admin/view_unit.php']")
private WebElement manageunitBtn;

@FindBy(xpath="//a[@href='add_unit.php']//input[@class='submit_button']")
private WebElement addunitBtn;

@FindBy(id="unitName")
private WebElement unitname;   

@FindBy(id="unitDetails")
private WebElement unitdetails;	
	
@FindBy(xpath="//input[@value='Add Unit']")
private WebElement addunitsubBtn;

public WebDriver getDriver() {
	return driver;
}

public WebElement getManageunitBtn() {
	return manageunitBtn;
}

public WebElement getAddunitBtn() {
	return addunitBtn;
}

public WebElement getUnitname() {
	return unitname;
}

public WebElement getUnitdetails() {
	return unitdetails;
}

public WebElement getAddunitsubBtn() {
	return addunitsubBtn;
}


	
	
	
}
