package com.Neotech.Lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson.utils.BaseClass;

public class HomeWork2Chap9 extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
	
		/**
		 	1) Open chrome browser
			2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
			3) Login to the application
			4) Click on the checkbox of all orders with product FamilyAlbum
			5) Delete Selected orders
			6) Verify the orders have been deleted
			7) Quit the browser
		 */
		
		setup();
		

		driver.findElement(By.xpath("//input[@id ='ctl00_MainContent_username']")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		 Thread.sleep(15000);
		
		List <WebElement> column3Value = driver.findElements(By.xpath("//table [@id ='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));
		
		// check ecah element if its equal to FamilyAlbum
		// if Yes, click on the column found in the same record
		
		for (int i = 0; i < column3Value.size(); i++)
		{
			
			String text = column3Value.get(i).getText();
			System.out.println("column 3 text for Row "+ i +" : " + text);
			
			if (text.equals("FamilyAlbum"))
			{
				// where is the check box located?
				// table [@id ='ctl00_MainContent_orderGrid']/tbody/tr[???]/td[3]"));
				
				// all paths ending in td[1] are check boxes, which one we click on is defined as based on the row number
				
				String path = "//table [@id ='ctl00_MainContent_orderGrid']/tbody/tr[" + ( i + 2 ) + "]/td[1]";
					driver.findElement(By.xpath(path)).click();
					
					Thread.sleep(2000);
					
			}
		}
		
		
		
		tearDown();
		
		
		
		
		
		
		
	}
	
}

