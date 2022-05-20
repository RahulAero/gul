package org.artifact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.iplt20.com/points-table/men/2022");
		List<WebElement> findElements = driver.findElements(By.tagName("td"));
		for(WebElement s : findElements) {
		System.out.println (s.getText());
		List<WebElement> findElements2 = driver.findElements(By.tagName("th"));
	   for(int i=0;i<findElements2.size();i++) {
		   System.out.println(findElements2.get(i).getText());
		   
	   }
	   File f = new File("R:\\Hornbill HOlidays\\Greens");
	   FileOutputStream stream = new FileOutputStream(f);
	   
	   
	   
	   
	
		

	}

}
	
	
	
}
