package org.unit.testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClassNew {
	
		public static WebDriver driver;
		public static Actions a;
		public static JavascriptExecutor j;
		public static WebDriver launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
		}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static void maxBrowser() {
			driver.manage().window().maximize();
		}
		public static void pageTitle() {
			String title=driver.getTitle();
			System.out.println(title);
		}
		public static void fill(WebElement e, String Value) {
			e.sendKeys(Value);
		}
		public static void btnClick(WebElement element) {
			element.click();
		}
		public static void pageUrl() {
			String url=driver.getCurrentUrl();
		}
		public static void clickDouble(WebElement ref) {
			a=new Actions(driver);
			a.doubleClick(ref).perform();
		}
		public static void rightClick(WebElement element) {
			a.contextClick(element);
		}
		
		
}
	
		
		

