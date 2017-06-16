package com.demo.org.Test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

	WebDriver driver;
	public LogIn(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	 public void run()
	 {
		 driver.navigate().to("https://dev.tracko.co.in/");
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("901109969696");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pppppp");
		// driver.findElement(By.linkText("Forgot password?")).click();
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.close();
	 }
	 
}
