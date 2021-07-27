package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	public static WebDriver driver;
	public static void setProperty(String driver,String path) {
		System.setProperty(driver,path);
		
	}
	public static void chromeDriver() {
		driver=new ChromeDriver();
	}
	public static void launchBrowser(String url) {
		driver.get(url);
	}
	public static String dataDriven(WebElement e,int rowno,int cellno) throws Throwable {
		String value=null;
		File location= new File("C:\\Users\\Admin\\eclipse-workspace\\example.org\\DATABASE\\DataDriven.xlsx");
		FileInputStream stream=new FileInputStream(location);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType type = cell.getCellType();
		
		
		if (type==type.STRING) {
			value = cell.getStringCellValue();
			System.out.println(value);
			}
		else if (type==type.NUMERIC) {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value=String.valueOf(l);
			System.out.println(value);
			}
		System.out.println("Read done");
		
		
		return value;
}
	public static String dataWrite( int rowno,int cellno,String data) throws Throwable {
		String value=null;
		File location= new File("C:\\Users\\Admin\\eclipse-workspace\\example.org\\DATABASE\\DataWrite.xlsx");
		Workbook book = new XSSFWorkbook(location);
		Sheet sheet = book.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.getRow(rowno);
		Row createRow = sheet.createRow(rowCount+1);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			Cell cell = row.getCell(cellno);
			cell.setCellValue(data);
				
		}
		FileOutputStream outstream=new FileOutputStream(location);
		book.write(outstream);
		outstream.close();
		book.close();
		return value;
		
	}
	public static void sendInput(WebElement input, String inputs) {
		input.sendKeys(inputs);
		
	}
	public static String getValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
		
	}
	
	public static  void getScreenshot(String name ,int i) throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File Dest =new File("C:\\Users\\Admin\\eclipse-workspace\\example.org\\Result\\"+name+""+i+".jpg");
		FileUtils.copyFile(source, Dest);
	}
	}