package com.Neotech.Lesson9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson.utils.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//url = https://demo.seleniumeasy.com/table-search-filter-demo.html
		
		
		
		setup();
		
		System.out.println("------TABLE HEADER-------");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id ='task-table']/thead/tr/th"));
		
		Iterator <WebElement> it = headerData.iterator();
		
		while (it.hasNext()){
			String text =it.next().getText();
			System.out.println( text +"|");
			
		}
		
		System.out.println("-------------------------------------------------");
		
		//lets find the number of rows in the Table
		
		
		
		tearDown();
		
	}

}
