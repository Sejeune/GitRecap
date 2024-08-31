package com.Neotech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson11.CommonMethods;

public class DashBoardPage extends CommonMethods {

	
	public WebElement logo =driver.findElement(By.id("ohrm-small-logo"));
	
	
	public WebElement accountName = driver.findElement(By.id("account-name"));
	
	
}
