package org.Base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class Baseclass {
	public static WebDriver driver;
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\newmaven\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void windowsMax() {
		driver.manage().window().maximize();
	}
	public void getTitle(String text) {
		driver.getTitle();
	}

	public void textSend(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);

		// refName.sendKeys(value);
	}

	public void textSendBasedJS(String textValue, WebElement element) {
		try {
			// Type Casting
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + textValue + "')", element);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void windowsHandle(int index) {
		try {
			String parentWindowsID = driver.getWindowHandle();
			Set<String> allWindowsID = driver.getWindowHandles();
			/* To Craete List And ADD all the ID to List */
			List<String> li = new LinkedList<String>();
			li.addAll(allWindowsID);
			String ChildWindowsID = li.get(index);
			driver.switchTo().window(ChildWindowsID);
			System.out.println(index + "ChildWindows ID :" + ChildWindowsID);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void screenShot(String name) {

		try {
			// Type Casting // Narrowing Casting
			// LowerInterface ref = (LowerInterface)HigherInterfaceRef;
			TakesScreenshot ts = (TakesScreenshot) driver;

			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			File targetFile = new File("D:\\screenshot\\" + name + ".png");

			Files.copy(sourceFile, targetFile); // throws on IOException

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//	public String excelRead(int rownum,int cellnum) {
//
//		try {
//			File file = new File("C:\\Users\\Dell\\Desktop\\Datadriven\\readdate.xlsx");
//
//			FileInputStream stream = new FileInputStream(file);
//
//			Workbook book = new XSSFWorkbook(stream);
//
//			Sheet sheet = book.getSheet("Sheet1");
//
//			Row row = sheet.getRow(rownum);
//
//			Cell cell = row.getCell(cellnum);
//
//			CellType cellType = cell.getCellType();
//
//			String value = null;
//
//			switch (cellType) {
//			case STRING:
//				value = cell.getStringCellValue();
//				break;
//			case NUMERIC:
//				if (Date.isCellDateFormatted(cell)) {
//					Date dateCellValue = cell.getDateCellValue();
//					SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
//					value = simple.format(dateCellValue);
//
//				} else {
//					double numericCellValue = cell.getNumericCellValue();
//					long l = (long)numericCellValue;
//					BigDecimal valueOf = BigDecimal.valueOf(l);
//					value = valueOf.toString();
//				}
//				break;
//
//
//			default:
//				System.out.println("In valid Cell format");
//				break;
//			}
//
//
//			return value;
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}


	public  void maxWindow() {
		driver.manage().window().maximize();
	}
	public void Username(WebElement element,String text) {
		element.sendKeys(text);
	}
	public void passWord(WebElement p,String Pws) {
		p.sendKeys(Pws);
	}
	public void buttonClick(WebElement click) {
		click.click();
	}

	//drop down

	public void selectByValue(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByValue(text);
	}
	public void selectByIndex(WebElement element,int value)
	{
		Select s=new Select(element);
		s.selectByIndex(value);

	}
	private void selectByVisibleText(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);

	}
	public void fromtext(WebElement element,String fromplace) {
		element.sendKeys(fromplace);
	}
	public void totext(WebElement element,String toplace) {
		element.sendKeys(toplace);
	}
	public void journeyDate(WebElement d,String text) {
		d.sendKeys(text);
	}
	public  void promptAlert() {
		Alert a=driver.switchTo().alert();
		a.accept();

	}
	//alert
	public void SimpleAlret() throws InterruptedException
	{
		Alert simpleAlret=driver.switchTo().alert();
		simpleAlret.accept();
	}
	public void confirmAlert(int num) {
		Alert alert=driver.switchTo().alert();
		if(num==1)
		{
			alert.accept();
		}
		else
		{
			alert.dismiss();

		}
	}

	//prompt Alrrt
	public void Alartpromt(String text) {
		Alert confirmAlretusingSendkeys=driver.switchTo().alert();
		switch (text)
		{
		case"promptAlret":
			driver.switchTo().alert().sendKeys("welcome");
			confirmAlretusingSendkeys.accept();
			break;
		default:
			driver.switchTo().alert().sendKeys("no");
			confirmAlretusingSendkeys.accept();
			break;

		}
	}


	//frame Handle
	public void handleFrames(WebElement element) {						//ctrl+Shift+I=> 
		try
		{
			WebDriver frame=driver.switchTo().frame(element);				//give return type for driver
		}
		catch(Exception e) {
		}}
	//Right Click

	public void Rclick(String Key,String value)
	{
		Actions act=new  Actions(driver);
		act.contextClick().perform();
	}

	//DragAndDrop
	public void DragAndDrop(String Key,String source,String Target) {
		Actions act=new Actions(driver);
		WebElement sourceLoction=driver.findElement(By.xpath(source));
		WebElement TargetLocation=driver.findElement(By.xpath(Target));
		act.dragAndDrop(sourceLoction, TargetLocation).perform();
	}
	//doubleClick
	public void doubleClick(String key,String value) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}

	public void getAlert(String Alert)
	{
		switch(Alert)
		{
		case"accept":
			driver.switchTo().alert();
			break;
		case"dismiss":
			driver.switchTo().alert();
			break;
		case"promptok":
			driver.switchTo().alert().sendKeys("ok");
			break;
		case"promptcancel":
			driver.switchTo().alert().sendKeys("cancle");
			break;
		default:
			System.out.println("No Alret");
			break;
		}
	}
}

