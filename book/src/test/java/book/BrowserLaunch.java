package book;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	WebDriver driver;
	TakesScreenshot ts;
	Alert at;
	Actions a;
	File screenshot;
	Select s;
	
	private void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	       driver.get(url);
	       
	       	}
	
	
	private WebElement LocationElement(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	private WebElement locatingbyName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
   private WebElement LocatingByXpath(String xpath) {
	   WebElement findElement = driver.findElement(By.xpath(xpath));
	   return findElement;  

}
   private void enterText(WebElement element,String text) {
	   element.sendKeys(text);	

}
   private void buttonClick(WebElement element) {
	   element.click();	

}
   private String currenturl() {
	   String currentUrl = driver.getCurrentUrl();
	   return currentUrl; 
	   }
   private String pageTitle() {
	String title = driver.getTitle();
	return title;

}
   private void direction(String direction) {
	   if (direction=="forward") {
		   driver.navigate().forward();
		
	}
	   else if (direction=="backward") {
		   driver.navigate().back();
		
	}
	   else if (direction=="refresh") {
		   driver.navigate().refresh();
		
	}   
}
   private void screen(File des) throws IOException {
	   ts= (TakesScreenshot) driver;
	   File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(screenshotAs, des);
	   
	}
   private void mouseActions(WebElement element,String action) {
	a = new Actions(driver);
	switch (action) {
	case "hover":
		a.moveToElement(element).perform();
		
		break;
		case "click" :
			a.click().perform();
			break;
		case "double click" :
			a.doubleClick().perform();
			

	default:
		break;
	}

}
   
   public static void main(String[] args) {
	   
	  BrowserLaunch s = new BrowserLaunch();
	  s.browserLaunch("https://www.facebook.com/");
	   WebElement txtuser = s.LocationElement("email");
	   s.enterText(txtuser, "gul");
	   WebElement locatingbyName = s.locatingbyName("pass");
	   s.enterText(locatingbyName, "2344");
	   WebElement locatingByXpath = s.LocatingByXpath("//button[@name = 'login']");
	   s.buttonClick(locatingByXpath);
	   
	
}
   
	
	
	
	
	
	
	
}
