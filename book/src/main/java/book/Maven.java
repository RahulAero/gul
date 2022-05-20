package book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ragul\\eclipse-workspace\\mavenSetup\\Sample\\samples.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet createSheet = workbook.createSheet("Amazon");
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@type=\"text\"]"));		
		findElement.sendKeys("iphone13",Keys.ENTER);
			List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='a-page']"));
	
		 for (int i = 0; i <findElements.size(); i++) {

			  Row createRow = createSheet.createRow(i);
			  Cell createCell = createRow.createCell(0);
			  WebElement webElement = findElements.get(i);
			  String text = webElement.getText();
			  createCell.setCellValue(text);
			  FileOutputStream stream1 = new FileOutputStream(file);
			  workbook.write(stream1);
			  System.out.println("success");
			  
			 
			   
			 
			
		}
		
		
	}
}
//		List<WebElement> findElements = driver.findElements(By.tagName("td"));
//		 for (int i = 0; i < findElements.size(); i++) {
//			 WebElement webElement = findElements.get(i);
//			 String text = webElement.getText();
//			 Row createRow = createSheet.createRow(i);
//			 for (int j = 0; j < findElements.size(); j++) {
//				 Cell createCell = createRow.createCell(j);
//				 createCell.setCellValue(text);
//				 
//				
//			}
//			 FileOutputStream stream1 =new FileOutputStream(file);
//			 workbook.write(stream1);
//			
//			 
//			 
//			
//		}
//		 System.out.println("success");
//		}
	
	
//		File f = new File("C:\\Users\\ragul\\eclipse-workspace\\mavenSetup\\Sample\\samples.xlsx");
//		FileInputStream stream = new FileInputStream(f);
//		Workbook book = new XSSFWorkbook(stream);
//		Sheet createSheet = book.createSheet("Gul");
//	}	
//		
//		for (int i = 0; i < createSheet.; i++) {
//			Row createRow = createSheet.createRow(i);
//			for (int j = 0; j < createRow.getPhysicalNumberOfCells(); j++) {
//				Cell createCell = createRow.createCell(j);
//				createCell.setCellValue();
////				
////				
////			}
////			FileOutputStream stream1 = new FileOutputStream(f);
////			book.write(stream1);
//			System.out.println(stream1);
			
		
		
		
		
		

        
		 
		
		
		
		
		 

	
//		File file = new File("R:\\samples.xlsx");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook book = new XSSFWorkbook(stream);
//		Sheet createSheet = book.createSheet("Ragul");
//
//		Object[][] data = { { "Name", "mailid", "Number", "cgpa" }, { "Ajay", "aka@gmail.com", "8098093180", "9.5f" },
//				{ "ak", "ak@gmail.com", "99999", "8.8f" }, { "faz", "faz@gmail.com", "0000", "8.3" } };
//		for (int i = 0; i < data.length; i++) {
//			Row createRow = createSheet.createRow(i);
//			for (int j = 0; j < data.length; j++) {
//				Cell createCell = createRow.createCell(j);
//				Object value = data[i][j];
//				if (value instanceof String) {
//					createCell.setCellValue((String) value);
//
//				} else if (value instanceof Float) {
//					createCell.setCellValue((Float) value);
//				}
//
//				else if (value instanceof Long) {
//					createCell.setCellValue((Long) value);
//					
//
//				}
//				
//			}
//		}
//		FileOutputStream stream1= new FileOutputStream(file) ;
//		book.write(stream1);
//		System.out.println("done");
//	}
	

