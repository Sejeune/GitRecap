package com.Neotech.Test;

import com.Neotech.Lesson.utils.ConfigsReader;
import com.Neotech.Lesson11.CommonMethods;
import com.Neotech.Pages.DashBoardPage;
import com.Neotech.Pages.LoginPage;

public class LogInTestUsingPOM extends CommonMethods  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup();
		
		LoginPage login = new LoginPage();
		
		//sending the username
		
		sendText(login.username, ConfigsReader.getproperty("username"));
		
		// sending password
		sendText(login.password, ConfigsReader.getproperty("password"));
		
		// click on login
		
		click(login.LoginBtn);
		//or
		//login.LoginBtn.click();
		
		wait(3);
		
		DashBoardPage dashboard = new DashBoardPage();
		// lets validate if the logo on the dashboard is showing 
		
		if(dashboard.logo.isDisplayed())
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		//Lets validate that the employee name "Jacquelin White" is shown
		
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();
		
		if(actualName.equals(expectedName))
		{
			System.out.println(expectedName + " is logged in.");
		}
		else
		{
			System.out.println(expectedName + "is not logged in!!!");
		}
		
		wait(3);
		
		tearDown();
		
	}

}
