package com.naresh.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;






public class salesforce_exp2{
public static WebDriver driver;
@BeforeMethod
public void launch_salesforce()  {
	System.setProperty("Webdriver.Chrome.driver", "\"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	driver=new ChromeDriver();
	driver.get("nullhttps://login.salesforce.com/?locale=in");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

}
public void close() {
	driver.close();
}
}
 
