package com.Neotech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Neotech.Lesson11.CommonMethods;

public class LoginPage extends CommonMethods  {

	
	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement LoginBtn = driver.findElement(By.xpath("//button"));
}
