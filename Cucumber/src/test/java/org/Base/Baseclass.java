package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Baseclass {
		public static WebDriver driver;
	
	public static void Browserlaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
	public static void url(String s) {
		driver.get(s);
	}
	public static void click(WebElement w) {
		w.click();
	}
	public static void sendkeys(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	
	
	}

