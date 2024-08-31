package com.Neotech.Test;

import com.Neotech.Lesson.utils.ConfigsReader;
import com.Neotech.Lesson11.CommonMethods;
import com.Neotech.Pages.DashboardPageUsingPageFactory;
import com.Neotech.Pages.LoginPageUsingPageFactory;

public class LoninTestUsingPageFactory extends CommonMethods {

	public static void main(String[] args) {
		
		
		setup();
		
		LoginPageUsingPageFactory login = new LoginPageUsingPageFactory();
		DashboardPageUsingPageFactory dashboard = new DashboardPageUsingPageFactory();
		
		
		//send the username
		sendText(login.username, ConfigsReader.getproperty("username"));
		
		//send the password
		sendText(login.password, ConfigsReader.getproperty("password"));
		
		login.loginBtn.click();
		wait(3);
		
		// validate if the logo is dispalyed
		
		if(dashboard.logo.isDisplayed())
		{
			System.out.println("Test passed");
		}
		
		else
		{
			System.out.println("Test Failed!");
		}
		
		// Validate the account name
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();
		
		if(actualName.equals(expectedName))
		{
			System.out.println(expectedName +" is logged in!");
		}
		else
		{
			System.out.println(expectedName + " is Not Logged in!");
		}
		
		wait(3);
		
		tearDown();
		
		
		
		
	}

}
