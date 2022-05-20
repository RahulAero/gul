package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Exception, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2022");
		driver.manage().window().maximize();
		
		File file = new File("C:\\Users\\ragul\\eclipse-workspace\\DemoMaven\\samples\\data.xlsx");
		
		Workbook book =new XSSFWorkbook(file);
		Sheet createSheet = book.createSheet();
		
	
	WebElement element = driver.findElement(By.xpath("//div[@class='ih-pd ng-scope']"));
	
	String text = element.getText();
	
	System.out.println(text);
	
//	
//		for (int i = 0; i < args.length; i++) {
//			
//			
//			Row createRow = createSheet.createRow(i);
//			
//			
//				
//				Cell createCell = createRow.createCell(0);
//				
//				
//				createCell.setCellValue(text);
//				
//				
//				
//				
				
				
			
			
			
			
			
			
		}
		FileOutputStream out = new FileOutputStream(file);
		
		book.write(out);
		
		
	
	
	}
		

	}


