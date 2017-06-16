package com.demo.org.Test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Sign_Class



{
	WebDriver driver;
	
  public Sign_Class(WebDriver driver)
  {
	  this.driver= driver;
  }
	
  
  
  public void start()
  {
	  driver.findElement(By.xpath("//a[text()='Sign Up Free']")).click();
	//driver.findElement(By.className("signup-page access-page has-full-screen-bg")).sendKeys("ppppp");

  }
}


