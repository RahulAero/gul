package com.trial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	File f = new File("C:\\Users\\ragul\\eclipse-workspace\\Testng\\src\\test\\resources\\Config.property");
	FileReader read = new FileReader(f);
	Properties p = new Properties();
	p.load(read);
	String string = p.get("url").toString();
	driver.get(string);
	WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	String sea = p.get("name").toString();
	search.sendKeys(sea);
	
}
}
