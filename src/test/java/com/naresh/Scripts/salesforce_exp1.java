package com.naresh.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

@beforemethod
public class salesforce_exp1 {
static WebDriver driver;
public void launch_salesforce() throws InterruptedException {
	System.setProperty("Webdriver.Chrome.driver", "\"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.manage().window().maximize();

}
@AfterMethod
public void close_salesforce() {
	driver.quit();
}
}
