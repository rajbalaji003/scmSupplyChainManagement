package scmSCM.webdriverutility;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;


public class WebDriverUtility {

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
 
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}

	

	public void alert(WebDriver driver) {
		Alert confirmationPopup = driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		confirmationPopup.accept();
	}
	
	public void scrollUsingJSE(int x,int y,WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
	      
		  js.executeScript("window.scrollBy("+x+","+y+")");
		  
		  }
	public void scrolluptoELE(WebElement element,WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
	      
		js.executeScript("arguments[0].click()", element);
		  
		  }
	}

