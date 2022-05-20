package org.Baseclass;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC {

	Select s;
	public static WebDriver driver;
	TakesScreenshot ts;
	File screenshotAs;
	JavascriptExecutor js;
	Actions a;
	Point p;
	Dimension d;
	Alert alert;

	public void Initiate(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(url);
	}

	

	public void Click(WebElement element) {
		element.click();

	}

	private void navigate(String url) {
		driver.navigate().to(url);
	}

	private WebElement findElement(String locator, String value) {
		WebElement element = null;
		if (locator == "id") {
			element = driver.findElement(By.id(value));

		} else if (locator == "className") {
			element = driver.findElement(By.className(value));
		} else if (locator == "tagName") {
			element = driver.findElement(By.tagName(value));

		} else if (locator == "xpath") {
			element = driver.findElement(By.xpath(value));

		} else if (locator == "cssSelector") {
			element = driver.findElement(By.cssSelector(value));
			return element;

		}
		return element;

	}

	public void passText(WebElement element, String text) {
		element.sendKeys(text);

	}

	private void capture(File dest) throws IOException {
		ts = (TakesScreenshot) driver;
		File screenshotAs2 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs2, dest);

	}

	private void DropdownType(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
	}

	private List<WebElement> DropdownOption(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;

	}

//	private void DropdownSelectOption(WebElement element, String type, String Value) {
//		s = new Select(element);
//		switch (type) {
//		case "index":
//			s.selectByIndex(Integer.parseInt(Value));
//			break;
//		case "value":
//			s.selectByValue(Value);
//			break;
//		case "text":
//			s.selectByVisibleText(Value);
//
//		default:
//			System.out.println("invalid");
//			break;
//		}
//
//	}
	public static void waitFor() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	private WebElement dropDownFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
public String attrib(WebElement ele, String name) {
	String attribute = ele.getAttribute(name);
	return attribute;
    
}

//	private void DropdownDeselect(WebElement element, String value, String Type) {
//		s = new Select(element);
//		switch (Type) {
//		case "index":
//			s.deselectByIndex(Integer.parseInt(Type));
//			break;
//		case "value":
//			s.deselectByValue(value);
//			break;
//		case "text":
//			s.deselectByVisibleText(Type);
//
//		default:
//			System.out.println("invalid deselect");
//			break;
//		}
}
