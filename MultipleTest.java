package reporterPkg;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MultipleTest {
	static ExtentTest graphicaltest;
	static ExtentReports graphicalreports;
	@BeforeSuite
	public void beforeSuiteStart() {
		graphicalreports = new ExtentReports("C:\\Users\\user\\Desktop\\multipletestreport.html", true);

	}
	@BeforeMethod
	public void beforeeachTest(Method testMethod) {
		graphicaltest = graphicalreports.startTest(testMethod.getName());
		//System.setProperty("webdriver.edge.driver","C:\\drivers\\msedgedriver.exe");
		// driver = new EdgeDriver();
	}
	@Test
	public void loginTest()  {
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC1");	

		}
	@Test
	public void Inbox()  {
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC2");	
		}
	@Test
	public void composeTest()  {
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		graphicaltest.log(LogStatus.FAIL, "Navigated to TC3");	
		}
	@Test
	public void signout()  {
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		graphicaltest.log(LogStatus.PASS, "Navigated to TC3");	
		}
	@AfterMethod
	public void aftereachTest() {
		graphicalreports.endTest(graphicaltest);
		graphicalreports.flush();
	}
}
