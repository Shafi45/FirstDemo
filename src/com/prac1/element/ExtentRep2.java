package com.prac1.element;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRep2 extends BrowserLaunch
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLoggerE;
	public static ExtentTest parentExtentLogger;
	
	
	@Test
	public void extentRepSrc() throws IOException
	{
		driver.get("http://gmail.com");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		boolean buttonDisplay = button.isDisplayed();
		Assert.assertTrue(buttonDisplay);
		
		String filePath = "C:\\Users\\SHAFI\\Desktop\\IODemo2\\ScreenShot\\gmailNextButton.png";
		
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(filePath);
		FileUtils.copyFile(srcFile, DestFile);	
		
		htmlReporter = new  ExtentHtmlReporter("C:\\Users\\SHAFI\\Desktop\\IODemo2\\extentreports\\gmailNextButton.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger =extent.createTest("Gmail Label Test");
		extentLoggerE = parentExtentLogger.createNode("Gmail label");
		extentLoggerE.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed", ExtentColor.GREEN));
		
		extentLoggerE.pass("",MediaEntityBuilder.createScreenCaptureFromPath(filePath).build());
		extent.flush();
				
	}

}
