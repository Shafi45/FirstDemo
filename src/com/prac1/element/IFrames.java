package com.prac1.element;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class IFrames extends BrowserLaunch
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLoggerE;
	public static ExtentTest parentExtentLogger;
	
	@Test
	public void iframeTest()
	{
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.switchTo().frame(0);
		WebElement date = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/h2/span"));
		String expectedData = "Saturday, 3 January 2015";
		String actualData = date.getText();
		Assert.assertEquals(actualData, expectedData);
	}
	
	@Test
	public void extRep()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\SHAFI\\Desktop\\IODemo2\\extentreports\\test1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		extentLoggerE = parentExtentLogger.createNode("Senario1");
		extentLoggerE.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skipped", ExtentColor.ORANGE));
		//extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case Passed", ExtentColor.GREEN));
	//	extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case Failed", ExtentColor.RED));
		
		parentExtentLogger = extent.createTest("Test2");
		extentLoggerE = parentExtentLogger.createNode("Senario2");
		extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case Passed", ExtentColor.GREEN));
		
		parentExtentLogger = extent.createTest("Test3");
		extentLoggerE = parentExtentLogger.createNode("Senario3");
		extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case Failed", ExtentColor.RED));
		extent.flush();
	}

}
