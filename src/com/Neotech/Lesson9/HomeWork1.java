package com.Neotech.Lesson9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Neotech.Lesson.utils.BaseClass;

public class HomeWork1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
// https://neotech.vercel.app/
	 setup();
	 
	 // implicit wait
	        // declared once the driver object is created
	        // will apply to all findElement and findElements call
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 // click on the interaction
	 
	 driver.findElement(By.id("menu-interactions")).click();
	 driver.findElement(By.xpath("//a[@id = 'waits']")).click();
	 
	 // click on the enable button
	 
	 driver.findElement(By.xpath("// form[@id = 'input-example']/button")).click();
	 
	 // there is a wait here
	 // the text box is there but not enabled yet
	 
	 WebElement textBox = driver.findElement(By.xpath("//form[@id = 'input-example']/input"));
	 
	 // defind a WebDriverWait object
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(textBox));
	 
	 textBox.sendKeys("Phils");
	 
	 Thread.sleep(3000);
	 
	 
	 tearDown();
	 
	 
	 
	 
	}

}
