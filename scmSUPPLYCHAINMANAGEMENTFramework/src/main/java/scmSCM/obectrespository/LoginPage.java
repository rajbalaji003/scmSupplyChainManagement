package scmSCM.obectrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import scmSCM.webdriverutility.WebDriverUtility;


public class LoginPage extends WebDriverUtility {
	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
		
	}
		
		
		@FindBy(id="login:username")
		private WebElement usernameEdt;
		
		@FindBy(id="login:password")
		private WebElement passwordEdt;
		
		
		@FindBy(id="login:type")
		private WebElement loginDDN;
		
		@FindBy(xpath="//input[@class='submit_button']")
		private WebElement loginBtn;
		
public WebDriver getDriver() {
			return driver;
		}



public WebElement getUsernameEdt() {
			return usernameEdt;
		}


public WebElement getPasswordEdt() {
			return passwordEdt;
		}



public WebElement getLoginDDN() {
			return loginDDN;
		}


public WebElement getLoginBtn() {
			return loginBtn;
		}

public void loginapp(String url) {
			    waitForPageToLoad(driver);
			    driver.get(url);
			    driver.manage().window().maximize();
				loginBtn.click();
	}
		
}
	
	
	
	

