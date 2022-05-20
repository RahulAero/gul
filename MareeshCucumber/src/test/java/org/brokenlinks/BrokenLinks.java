package org.brokenlinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		int brokencount=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement findElement = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		//findElement.click();
		List<WebElement> allLi = driver.findElements(By.tagName("img"));
		//li.size();
		//System.out.println(size);
		for (int i = 0; i < allLi.size(); i++) {
			
			
			 WebElement urls = allLi.get(i);
			 String attribute = urls.getAttribute("href");
			 URL url=new URL(attribute);
			 //URL url2=
			 URLConnection urlConnection=url.openConnection();
			
			HttpsURLConnection connection=(HttpsURLConnection) urlConnection;
			int code = connection.getResponseCode();
			
			if(code!=200)
			{
				brokencount++;
				System.out.println("Broken Links are :"+ attribute );
				
			}
			
		}
		System.out.println("Broken Links are"+ brokencount );
			
			
			
			
			 
			 
			
			
								
					
					
					
				
			
		}
		
	

}
