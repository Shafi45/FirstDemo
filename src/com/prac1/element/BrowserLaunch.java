package com.prac1.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BrowserLaunch 
{
public WebDriver driver;
	

	@BeforeClass
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAFI\\workspace\\com.practicedemo1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
