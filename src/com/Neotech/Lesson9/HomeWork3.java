package com.Neotech.Lesson9;

import java.time.Duration;

import org.openqa.selenium.By;

import com.Neotech.Lesson.utils.BaseClass;
import com.Neotech.Lesson.utils.ConfigsReader;

public class HomeWork3 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// https://hrm.neotechacademy.com/
	
		
		setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getproperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getproperty("password"));
		
		//Log in
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		// click and open the PIM menu
		driver.findElement(By.xpath("//li[@id = 'menu_pim_viewPimModule']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		
		
		
		
		
		
		
		tearDown();
		
		
		
	}

}
