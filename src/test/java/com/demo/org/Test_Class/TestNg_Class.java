package com.demo.org.Test_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNg_Class
{
	WebDriver driver;
  @Test(priority=2)
  
  public void firstf()
  {
	  Sign_Class ref=new Sign_Class(driver);
	  ref.start();
	  
  }
@Test(priority=3,dependsOnMethods="firstf")
  
  public void second()
  {
	LogIn ref1=new LogIn(driver);
	ref1.run();
	  
  }
  @Parameters("browsersss")
  @BeforeTest
  
//@Test(priority=1,dataProvider="browsersss")

  public void beforeTest(String browsers) 
   {
	  String browser=browsers;
	if (browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		  driver=new ChromeDriver();
	}
	else if (browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
		  driver=new FirefoxDriver();
		  
	}
	else if(browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	
	}
	else 
	{
		System.out.println("Browser you specified is not available");

	}
	  driver.get("https://dev.tracko.co.in/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

//@DataProvider(name="browsersss")
public Object[][] mydata()
{
//My name is prashnt patil 
	Object data[][]=new Object[1][1];
	data[0][0]="Chrome";
	//data[1][0]="firefox";
	
	return data;
	
}

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
