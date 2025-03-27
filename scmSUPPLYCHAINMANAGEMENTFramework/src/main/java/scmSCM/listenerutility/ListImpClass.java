package scmSCM.listenerutility;





import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import scmSCM.basetest.BaseClass;
import scmSCM.webdriverutility.UtilityClassObject;

public class ListImpClass implements ITestListener ,ISuiteListener {
	

	    public  ExtentReports report;
	    
	    public static ExtentTest test;
	    
	    
	    
		

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report configuration");
		
		/*spark report config*/	
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvancedReport/report.html");
		spark.config().setDocumentTitle("SCMTest Suite Results");
		spark.config().setReportName("SCM Report");
		spark.config().setTheme(Theme.DARK);
		
			
			
			/*add Extend information & create Test*/
		 report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("os", "Windows-11");
		report.setSystemInfo("Browser", "Chrome");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("=====>"+result.getMethod().getMethodName()+">==========START==========");
		test = report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		
		test.log(Status.INFO,result.getMethod().getMethodName()+"=====>STARTED<=====");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("=====>"+result.getMethod().getMethodName()+">=====END=========");
		test.log(Status.PASS,result.getMethod().getMethodName()+"=====>COMPLETED<=====");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;		
		System.out.println("driver:"+BaseClass.sdriver);
		
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
		
		String time = new Date().toString().replace(" ","_").replace(":", " ");
		
		test.addScreenCaptureFromBase64String(filepath,testName+"_"+time);
		
		test.log(Status.FAIL,result.getMethod().getMethodName()+"=====>FAILED<=====");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	}

