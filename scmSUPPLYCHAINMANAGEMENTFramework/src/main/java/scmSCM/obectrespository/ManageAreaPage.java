package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAreaPage {
WebDriver driver;
	public ManageAreaPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
		
		@FindBy(xpath="//aside//a[@href='../admin/view_area.php']")
		private WebElement manageareaBtN;
		
		@FindBy(xpath="//a[@href='add_area.php']//input[@class='submit_button']")
		private WebElement addareaBtN;
		
		@FindBy(id="areaName")
		private WebElement areaname;
		
		@FindBy(id="areaCode")
		private WebElement areacode;
		
		@FindBy(xpath="//input[@value='Add Area']")
		private WebElement addareaSubBtN;
		
		
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getManageareaBtN() {
		return manageareaBtN;
	}



	public WebElement getAddareaBtN() {
		return addareaBtN;
	}



	public WebElement getAreaname() {
		return areaname;
	}



	public WebElement getAreacode() {
		return areacode;
	}


	public WebElement getAddareaSubBtN() {
		return addareaSubBtN;
	}
	
	
		
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
