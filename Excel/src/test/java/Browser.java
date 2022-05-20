import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2022");
		driver.manage().window().maximize();
		
		
		WebElement table = driver.findElement(By.xpath("td"));
    System.out.println(table.getText());
//    String text = table.getText();
//    System.out.println(text);
//    File f = new File("C:\\Users\\ragul\\OneDrive\\Desktop.xlsx");
//    FileOutputStream stream = new FileOutputStream(f);
//   Workbook book = new XSSFWorkbook();
   
//    
    
    
    
    
	}

}
