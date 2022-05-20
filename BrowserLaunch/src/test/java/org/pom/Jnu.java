package org.pom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jnu {
	public static WebDriver driver;
      @org.testng.annotations.AfterClass
	public static void tc0() throws WebDriverException, IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("R:\\Automation Notes\\Videos\\sample.png"));
		 
		 
	}
	@BeforeClass
	public static void tc1() {
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");

	}
	@Test
	public void tclogin0() {
		driver.findElement(By.id("email")).sendKeys("ragul");
		driver.findElement(By.id("pass")).sendKeys("1234");

	}
	@After
	public  void tclogin1() {
		 Date d = new Date();
		 System.out.println("crededntials");

	}
	@Before
	public void tc2login() {
		Date d1 = new Date();
		System.out.println("after credentials");

	}
   
   
   
	
	

}
