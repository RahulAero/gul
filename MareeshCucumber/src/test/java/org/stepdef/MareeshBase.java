package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MareeshBase {
	public static WebDriver driver;

	public static void geturl(String browser, String url) {
		switch (browser) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			break;

		default:
			break;
		}

		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void typetext(WebElement text, String data) {
		text.sendKeys(data);

	}

	public void click(WebElement ref) {
		ref.click();
	}

	public String getAttribute(WebElement text, String type) {
		return text.getAttribute(type);

	}

	public void dropbyvalue(WebElement txt, String text) {
		Select s = new Select(txt);
		s.selectByVisibleText(text);
	}

	public String gettext(WebElement text) {
		return text.getText();

	}

}
