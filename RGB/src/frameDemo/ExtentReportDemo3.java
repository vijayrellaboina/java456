package frameDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo3 {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	public ExtentTest parentExtentLogger;
	@Test
	
	public void extentreports1() throws IOException {
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\madasuvamsi\\Desktop\\extentReports\\"+"Test1.html");
		extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	parentExtentLogger = extent.createTest("Test1");
	extentLogger = parentExtentLogger.createNode("Add User with Madatory Field");
    extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1", ExtentColor.GREEN));
    extentLogger.log(Status.FAIL,MarkupHelper.createLabel("TestCase1", ExtentColor.RED));       
    extentLogger.log(Status.SKIP,MarkupHelper.createLabel("TestCase1", ExtentColor.GREY));
  
    
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Weddriver\\chromedriver.exe");
	ChromeDriver  driver =new  ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	TakesScreenshot ts =  driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	String destination = "C:\\Users\\madasuvamsi\\Desktop\\Screenshot\\screen1.png";
	File finalDestination = new File(destination);
	FileUtils. copyFile(source, finalDestination);
		
	extentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
	
	 extentLogger = parentExtentLogger.createNode("TestCase2");
	 extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1", ExtentColor.GREEN));
	extent.flush();
}
}