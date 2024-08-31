package com.Neotech.Lesson9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.Neotech.Lesson.utils.BaseClass;

public class HomeWork2 extends BaseClass {

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
	 
	 // defind a FluentWait object
	 
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	 wait.withTimeout(Duration.ofSeconds(10));
	 wait.pollingEvery(Duration.ofSeconds(2));
	 
	 // we can even ignore certain exceptions
	 
	
	 
	 
	 textBox.sendKeys("Phils");
	 
	 Thread.sleep(3000);
	 
	 
	 tearDown();
	 
	 
	 
	 
	}

}
