package br.ce.wcaquino.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX:
					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					driver = new FirefoxDriver(); break;
				case CHROME: 
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					driver = new ChromeDriver(); break;
			}
			driver.manage().window().maximize();			
		}
		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
