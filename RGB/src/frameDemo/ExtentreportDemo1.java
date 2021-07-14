package frameDemo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mongodb.diagnostics.logging.Logger;

public class ExtentreportDemo1 {

	

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	public ExtentTest parentExtentLogger;
	
	@Test
	public void extentreports() throws IOException {
		
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\madasuvamsi\\Desktop\\extentReports\\"+"Test1.html");
		extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	parentExtentLogger = extent.createTest("Test1");
	extentLogger = parentExtentLogger.createNode("Add User with Madatory Field");
    extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1", ExtentColor.GREEN));
    extentLogger.log(Status.FAIL,MarkupHelper.createLabel("TestCase1", ExtentColor.RED));       
    extentLogger.log(Status.SKIP,MarkupHelper.createLabel("TestCase1", ExtentColor.GREY));
    extentLogger.addScreenCaptureFromPath("‪C:\\Users\\madasuvamsi\\eclipse-workspace\\Selenium class\\RGB\\Screenshot\\Logo.png");
    extent.flush();
	
	}
}
