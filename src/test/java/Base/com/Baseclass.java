package Base.com;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
    public static void launchBrowser() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public static void launchBrowser1() {
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
  
    
    public static void windowMacimize() {
    	driver.manage().window().maximize();
    }
    
    public static void launchUrl(String url) {
    	driver.get(url);
    }
    
    public static void pageTitle() {
    	
    String title = driver.getTitle();
    System.out.println(title);
    }
    
    public static void pageUrl() {
    	String url = driver.getCurrentUrl();
    	System.out.println(url);
    }
    
    public static void passText(String txt, WebElement ele) {
    	
    	ele.sendKeys(txt);
    }
    
    public static void closeEntireBrowser() {
    	driver.quit();
    }
    
    public static void clickBtn(WebElement ele) {
    	ele.click();
    }
    
    public static void screenShot(String imgName) throws IOException {
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File image = ts.getScreenshotAs(OutputType.FILE);
    	File f = new File("location"+imgName+".png");
    	FileUtils.copyFile(image, f);
    }
    
    public static Actions a;
    
    public static void movethecursor(WebElement targetwebelement)
    {
    	a=new Actions(driver);
    	a.moveToElement(targetwebelement).perform();
    }
    
    public static void dragdrop(WebElement dragwebelement,WebElement dropwebelement)
    {
    	a=new Actions(driver);
    	a.dragAndDrop(dragwebelement, dropwebelement).perform();
    }
    public static JavascriptExecutor js;
    
    
    public static void scrollthepage(WebElement tarwebele)
    {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", tarwebele);
    }
    public static void scrollpage(WebElement ele)
    {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(false)",ele);
    }
    
  
    
    public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
    	
    	File f= new File("C:\\Users\\My Pc\\eclipse-workspace\\mavenpro\\excel\\Book1.xlsx");
    	FileInputStream fis = new FileInputStream(f);
    	Workbook wb = new XSSFWorkbook(fis);
    	Sheet mysheet = wb.getSheet(sheetName);
    	Row r = mysheet.getRow(rowNum);
    	Cell c = r.getCell(cellNum);
    	int cellType = c.getCellType();
    	
    	String value = " ";
    	if(cellType==1) {
    		String value2 = c.getStringCellValue();
    		System.out.println(value2);
    	}
    	else if(DateUtil.isCellDateFormatted(c)){
    		Date dd = c.getDateCellValue();
    		SimpleDateFormat s = new SimpleDateFormat(value);
    		String value1 = s.format(dd);
    	}
    	
    	else {
    		double d = c.getNumericCellValue();
    		long l =(long) d;
    		String valueOf = String.valueOf(l);
    	}
    }
    
    public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
    	
    	File f = new File("C:\\Users\\My Pc\\eclipse-workspace\\mavenpro\\excel\\newfile.xlsx");
    	Workbook w = new XSSFWorkbook();
    	Sheet newSheet = w.createSheet("data1");
    	Row newRow = newSheet.createRow(rowNum);
    	Cell newcell = newRow.createCell(cellNum);
    	newcell.setCellValue(newData);
    	FileOutputStream fos = new FileOutputStream(f);
    	w.write(fos);
    }
    
 public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
    	
    	File f = new File("C:\\\\Users\\\\My Pc\\\\eclipse-workspace\\\\mavenpro\\\\excel\\\\newfile.xlsx");
    	FileInputStream fis = new FileInputStream(f);
    	Workbook w = new XSSFWorkbook(fis);
    	Sheet newSheet = w.createSheet("data2");
    	Row newRow = newSheet.createRow(rowNum);
    	Cell newcell = newRow.createCell(cellNum);
    	newcell.setCellValue(newData);
    	FileOutputStream fos = new FileOutputStream(f);
    	w.write(fos);
    }
 
 public static void createRow(int creRow, int creCell, String newData) throws IOException {
 	
 	File f = new File("C:\\\\Users\\\\My Pc\\\\eclipse-workspace\\\\mavenpro\\\\excel\\\\newfile.xlsx");
 	FileInputStream fis = new FileInputStream(f);
 	Workbook w = new XSSFWorkbook(fis);
 	Sheet newSheet = w.createSheet("data3");
 	Row newRow = newSheet.createRow(creRow);
 	Cell newcell = newRow.createCell(creCell);
 	newcell.setCellValue(newData);
 	FileOutputStream fos = new FileOutputStream(f);
 	w.write(fos);
 }
 
 public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException {
 	
 	File f = new File("C:\\\\Users\\\\My Pc\\\\eclipse-workspace\\\\mavenpro\\\\excel\\\\newfile.xlsx");
 	FileInputStream fis = new FileInputStream(f);
 	Workbook w = new XSSFWorkbook(fis);
 	Sheet s = w.getSheet("data4");
 	Row r = s.getRow(getTheRow);
 	Cell c = r.getCell(getTheCell);
 	String str = c.getStringCellValue();
 	if(str.equals(existingData)) {
 		c.setCellValue(writeNewData);
 	}
 	FileOutputStream fos = new FileOutputStream(f);
 	w.write(fos);
 }
 
 
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
