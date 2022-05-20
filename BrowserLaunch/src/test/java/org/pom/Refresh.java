package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh {
	
		  public static WebDriver driver;
		  Select s;
		
		
		 public static void browserlaunch(String url) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get(url);
			 
			

		}
   public void tk(WebElement element,String text) {
	   element.sendKeys(text);
	   
	
  
}
    public void dropDownSelectOption(WebElement element , String values) {
    	s = new Select(element);
    	s.selectByValue(values);
		}
    
		

	

}
   
	



