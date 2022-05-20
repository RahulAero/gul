package mavenSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
  public static void main(String[] args) throws IOException {
	  
			File f = new File("C:\\Users\\ragul\\OneDrive\\Documents\\WorkBook\\Book2.xlsx");
		FileOutputStream stream = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Ragul");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Tenet");
		w.write(stream);
  
   File f1 = new File("C:\\Users\\ragul\\OneDrive\\Documents\\WorkBook\\Book1.xlsx");
   FileInputStream stream1 = new FileInputStream(f1);
   Workbook w1 = new XSSFWorkbook(stream1);
   Sheet sheet = w1.getSheet("sheet1");
   Row row = sheet.getRow(0);
   Cell cell = row.getCell(0);
   String stringCellValue = cell.getStringCellValue();
   System.out.println(stringCellValue);
   
   
  
   
   
		
		
	
		
		
		
		
		
		
		
}
}
