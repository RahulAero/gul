package mavenSetup;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.tagName("tr"));
	   for (WebElement r : row) {
	    	System.out.println(r.getText());
	   }
	  
	   
		
	}
	    	
	   

			}
			
		
			
			
		}
		
	
		

	


