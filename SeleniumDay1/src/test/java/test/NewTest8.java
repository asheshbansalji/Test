package test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.util.SystemOutLogger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewTest8 {

	ExtentHtmlReporter htmlreporter;
	ExtentReports reports;
	ExtentTest logger;
	
	@BeforeTest
public void beforeTest() {
		
		
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/extent_reports/reports1.html");
		
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		reports.setSystemInfo("host", "localHost Training");
		reports.setSystemInfo("username", "namita.koni");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setReportName("Report for UBS");
	}
	
	@Test
	public void testPass()
	{
		logger=reports.createTest("test pass");
		logger.log(Status.PASS,"This test is passed");
		
	}
	

	@Test
	public void testSkipp()
	{
		logger=reports.createTest("test skip");
		logger.log(Status.SKIP,"This test is Skipped");
		
	}

	@Test
	public void testFail()
	{
		logger=reports.createTest("test fail");
		logger.log(Status.FAIL,"This test is failed");
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, "This test is failed");
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			logger.log(Status.SKIP, "This test is Skipped");
		}
	}
	@AfterMethod
	public void afterTest()
	{
		reports.flush();
	}
}

