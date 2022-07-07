package com.prac1.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable2 extends BrowserLaunch
{
	@Test
	public void securityTable()
	{
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		List<WebElement> scColum =  driver.findElements(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[1]"));
		int scCSize = scColum.size();
		System.out.println("Security Code Count :"+ scCSize);
		
		for(int i=1; i<=scCSize;i++ ) 
		{
			WebElement firstCell = driver.findElement(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr["+i+"]/td[1]"));
			String Data = firstCell.getText();
			System.out.println(Data);
			// To print Total Row
		}
		
		for(int i=25; i<=scCSize;i++ ) 
		{
			WebElement firstCellHalf = driver.findElement(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr["+i+"]/td[1]"));
			String Data2 = firstCellHalf.getText();
			System.out.println(Data2);
			// To print Total Row
		}
	}

}
