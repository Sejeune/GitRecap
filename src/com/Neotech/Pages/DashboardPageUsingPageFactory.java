package com.Neotech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Neotech.Lesson.utils.BaseClass;

public class DashboardPageUsingPageFactory {

	
	@FindBy(id="orhm-small-logo")
	public WebElement logo;
	
	@FindBy(id="account-name")
	public WebElement accountName;
	
	public DashboardPageUsingPageFactory()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
