package episode1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ragul\\eclipse-workspace\\episode1\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("gulgul");
	WebElement txtpass= driver.findElement(By.id("pass"));
	txtpass.sendKeys("1234");
	WebElement buttonlogin = driver.findElement(By.xpath("//button[@name=\"login\"]"));
	buttonlogin.click();
	driver.navigate().to("https://www.instagram.com/?hl=en");
	
		
		
	}

}
