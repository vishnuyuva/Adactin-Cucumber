package com.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	public static String value;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static WebDriver close() {
		driver.close();
		return driver;
	}

	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

	public static WebDriver navigateto(String url) {
		driver.navigate().to(url);
		return driver;
	}

	public static WebDriver navigateback() {
		driver.navigate().back();
		return driver;
	}

	public static WebDriver navigateforward() {
		driver.navigate().forward();
		return driver;
	}

	public static WebDriver navigaterefresh() {
		driver.navigate().refresh();
		return driver;
	}

	public static WebDriver alert(String type, String ok_cancel, String input) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("simplealert")) {
			if (ok_cancel.equalsIgnoreCase("ok")) {
				a.accept();
			}
		} else if (type.equalsIgnoreCase("confirmalert")) {
			if (ok_cancel.equalsIgnoreCase("ok")) {
				a.accept();
			} else {
				a.dismiss();
			}
		} else if (type.equalsIgnoreCase("promptalert")) {
			a.sendKeys(input);
			if (ok_cancel.equalsIgnoreCase("ok")) {
				a.accept();
			} else {
				a.dismiss();
			}
		}
		return driver;
	}

	public static WebDriver actions(String type, WebElement element1) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			a.click(element1).build().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			a.contextClick(element1).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element1).build().perform();
		}
		return driver;
	}

	public static WebDriver actions(String type, WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element1, element2).build().perform();
		}
		return driver;
	}

	public static void frames(String type, String value) {
		if (type.equalsIgnoreCase("name/id")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		} else if (type.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}

	public static WebDriver getWindowHandle() {
		String parentname = driver.getWindowHandle();
		System.out.println(parentname);
		return driver;
	}

	public static WebDriver getWindowHandles(String type) {
		if (type.equalsIgnoreCase("size")) {
			int size = driver.getWindowHandles().size();
			System.out.println("number of windows:" + size);
		} else if (type.equalsIgnoreCase("allwindows")) {
			Set<String> allwindow = driver.getWindowHandles();
			for (String cw : allwindow) {
				String title = driver.switchTo().window(cw).getTitle();
				System.out.println("All windows title:" + title);
			}
		} else if (type.equalsIgnoreCase("closenonparentwindow")) {
			String pw = driver.getWindowHandle();
			Set<String> allwindow = driver.getWindowHandles();
			for (String cw : allwindow) {
				if (!cw.equals(pw)) {
					driver.switchTo().window(cw);
					driver.close();
				}
			}
		}
		return driver;
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectbyvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("selectbyindex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("selectbyvisibletext")) {
			s.selectByVisibleText(value);
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void checkbox(WebElement element) {
		element.click();
	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
		}
	}

	public static WebDriver getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return driver;
	}

	public static WebDriver getCurrentUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		return driver;
	}

	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}

	public static void getAttribute(WebElement element, String value) {
		System.out.println(element.getAttribute(value));
	}

	public static void radiobutton(WebElement element) {
		element.click();
	}

	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstselected = s.getFirstSelectedOption();
		System.out.println(firstselected.getText());
	}

	public static void getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allselected = s.getAllSelectedOptions();
		for (WebElement all : allselected) {
			System.out.println(all.getText());
		}
	}

	public static void getScreenshot(String pathname) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destini = new File(pathname);
		FileUtils.copyFile(source, destini);
	}

	public static void wait(String type, WebElement element) {
		if (type.equalsIgnoreCase("implicit")) {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (type.equalsIgnoreCase("explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	public static void scroll(String type, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollBy(x,y);");
		} else if (type.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(x,-y);");
		} else if (type.equalsIgnoreCase("bottom")) {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} else if (type.equalsIgnoreCase("home")) {
			js.executeScript("window.scrollBy(0,0)");
		}
	}

	public static void robot(int type) throws Throwable {
		Robot r = new Robot();
		r.keyPress(type);
		r.keyRelease(type);
	}

	/*
	 * public static String read_Data(String path,String sheetname,int rownum,int
	 * cellnum) throws IOException { File f=new File(path); FileInputStream fis=new
	 * FileInputStream(f); Workbook wb=new XSSFWorkbook(fis); Sheet
	 * sheet=wb.getSheet(sheetname); Row row=sheet.getRow(rownum); Cell
	 * cell=row.getCell(cellnum); CellType celltype=cell.getCellType();
	 * if(celltype.equals(CellType.STRING)) { value=cell.getStringCellValue(); }
	 * else if(celltype.equals(CellType.NUMERIC)) { double
	 * numericcellvalue=cell.getNumericCellValue(); int data=(int)numericcellvalue;
	 * value = String.valueOf(data); } wb.close(); return value; }
	 */
	public static void new_Tab() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_L);

	}

}
