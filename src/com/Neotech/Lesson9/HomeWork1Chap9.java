package com.Neotech.Lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson.utils.BaseClass;

public class HomeWork1Chap9 extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/**
		 *   
				1) Open chrome browser
				2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
				3) Login to the application
				4) Verify customer "Susan McLaren" is present in the table
				5) Click on customer details
				6) Update customers last name and credit card info
				7) Verify updated customers name and credit card number is displayed in table
				8) Close browser
				 
		 */
		
		setup();
		
		driver.findElement(By.xpath("//input[@id ='ctl00_MainContent_username']")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		 Thread.sleep(15000);
		 
		 
		 // 1st way, get the table using id, get its text and check if it contains "suzan mclaren"
		 
			/*
			 * String tableContent = driver.findElement(By.id("ctl00_MainContent_orderGrid")).getText();
			 * System.out.println(tableContent.contains("Susan McLaren"));
			 * System.out.println(tableContent);
			 */
		 // second way, we need to click only on the box that gives us access to her details
		 
		 List <WebElement> rows = driver.findElements(By.xpath("//table [@id ='ctl00_MainContent_orderGrid']/tbody/tr"));
		 
		 // I need to have access to the record number after the loop is done
		 int rowNumber = -1;
		 
		 for (int i = 0; i < rows.size(); i++)
		 {
			 String rowText = rows.get(i).getText();
			 
			 if (rowText.contains("Susan McLaren"))
			 {
				 // click on the button at the end of the row!!!
				 System.out.println("Finding element i --->" + i );
				 
				 rowNumber = i + 1;
				 
				//  What was the xpath for the button we need to click?
				  
				 String path = "//table [@id ='ctl00_MainContent_orderGrid']/tbody/tr[ "+ rowNumber +" ]/td[13]";
				 System.out.println("the path is : " + path);
				 
				 Thread.sleep(1500);
				 
				 driver.findElement(By.xpath(path)).click();
				 Thread.sleep(4000);
				 
				 break;
				 
				 
			 }
		 }
		 
		 //Update customer information
		 
		 WebElement cName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		 
		 String currentNameUsingGetText = cName.getText();
		 String curreentNameUsingGetAttribute = cName.getAttribute("value");
		 System.out.println("Current Name (GetText): " + currentNameUsingGetText);
		 System.out.println("Current Nmae using (GetAttribute): " +curreentNameUsingGetAttribute);
		 
		cName.clear();
		cName.sendKeys("Susan Doe");
		
		WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		
		cardNumber.clear();
		cardNumber.sendKeys("00445687916005");
		
				Thread.sleep(4000);
		
	// update info
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		Thread.sleep(2000);
		
		// to verify it is updated, 
		       
		       //now we can use rowNumber here!!
		
		String newName = driver.findElement(By.xpath("//table [@id ='ctl00_MainContent_orderGrid']/tbody/tr[" + rowNumber + " ]/td[2]")).getText();
		
		System.out.println("The new name will be: " + newName);
		
		tearDown();
		
		
		
		
		
		
		
		
		
	}

}
