package com.prac1.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable extends BrowserLaunch
{
	@Test
	public void webTable()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		WebElement row1 = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String firstCell = row1.getText();
		System.out.println(firstCell);
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td"));
		int rowCount = row.size();
		System.out.println("ROw Count:" +rowCount);
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr/td[1]"));
		int colCount = columns.size();
		System.out.println("Column Size:"+ colCount);
		
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=1; j<=colCount; j++)
			{
				WebElement rows = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
				String Data = rows.getText();
				System.out.println(Data);

			}
		}
	}

}
