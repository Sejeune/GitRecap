package com.Neotech.Lesson9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson.utils.BaseClass;
import com.Neotech.Lesson.utils.ConfigsReader;

public class DynamicTable3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//https://hrm.neotechacademy.com/
		
		
		
		setup();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getproperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getproperty("password"));
		
		//Log in
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		// click and open the PIM menu
		driver.findElement(By.xpath("//li[@id = 'menu_pim_viewPimModule']")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(5000);
		
		//Lets find all the rows that contain the text Linda
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id ='employeeListTable']/tbody/tr"));
		
		String expected = "Linda";
		
		for (int i=0; i < rows.size(); i++)
		{
			String rowText = rows.get(i).getText();
			
			//Lets check the condition
			
			if(rowText.contains(expected))
			{
				List<WebElement> thirdColumnItems = (List<WebElement>) driver.findElement(By.xpath("//table[@id = 'employeeListTable']/tbody/tr/td[3]"));
				thirdColumnItems.get(i).click();
				break;
				
			}
		}
		
		Thread.sleep(4000);
		
		
		tearDown();
		
		
	}

}
