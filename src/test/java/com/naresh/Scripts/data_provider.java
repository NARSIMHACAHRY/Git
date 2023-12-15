package com.naresh.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import com.beust.jcommander.Parameter;
public class data_provider {
 WebDriver driver;
 @BeforeClass
 @Parameters("browsers")
 @Test
 public void differtcase(String browsers) {
	 switch(browsers.toLowerCase()) {
	 case "chrome"
:
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.jiocinema.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	break;
	 case"fire":
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\USER\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://web.whatsapp.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 break;
	 case"edge":
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\USER\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://mvnrepository.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 break;
		 
		 
	
	 }
 }
 
}
