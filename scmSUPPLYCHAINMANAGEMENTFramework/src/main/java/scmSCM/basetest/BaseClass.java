package scmSCM.basetest;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import scmSCM.databaseutility.DataBaseUtility;
import scmSCM.obectrespository.LoginPage;
import scmSCM.webdriverutility.UtilityClassObject;
import scmSCM.webdriverutility.WebDriverUtility;
import scmSMC.fileutility.ExcelUtility;
import scmSMC.fileutility.FileUtility;


 


public class BaseClass {
	/* Create Object */
	public DataBaseUtility dbLib = new DataBaseUtility();
	public FileUtility fLib = new  FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
   
	public static  WebDriver sdriver = null;
	public WebDriver driver = null;
	@BeforeSuite(groups = {"regressionTest","smokeTest"})
	public void configBS() {
		System.out.println("======connect to DB, Report config=======");
		dbLib.getDbconnection();
		
		}
		
		
	
	@Parameters("BROWSER")
	@BeforeClass(groups = {"regressionTest","smokeTest"})
	public void configBC(@Optional("chrome") String browser) throws IOException  {
		System.out.println("====Launch the BROWSER===");
		
		String BROWSER = browser;
				
	    if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
	    }
	
	       sdriver = driver;
	       UtilityClassObject.setDriver(driver);
        }


	@BeforeMethod(groups = {"regressionTest","smokeTest"})
	public void configBM() throws IOException  {
		System.out.println("=====login to appliction=====");
		
		String URL = fLib.getDataFromPropertiesFile("url");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.loginapp( URL);
		
		
	}
	@AfterMethod(groups = {"regressionTest","smokeTest"})
	public void configAM() {
		System.out.println("======logout of the application====");
		
	}
	@AfterClass(groups = {"regressionTest","smokeTest"})
	public void configAC() {
		System.out.println("======close the BROWSER=====");
		driver.quit();
	}
	
	
	@AfterSuite(groups = {"regressionTest","smokeTest"})
	public void configAS() {
		System.out.println("=======close DB,Report config");
		dbLib.closeDbconnection();
		
		
	}


	}
