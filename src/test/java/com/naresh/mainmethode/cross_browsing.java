package com.naresh.mainmethode;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naresh.Scripts.salesforce_exp2;



public class cross_browsing extends salesforce_exp2{
  static By unem=By.id("username");
  static By pass=By.id("password");
  static By lob=By.id("Longin");
  @Test(dataProvider="logindata")
  public void senddata(String username,String password) {
	 
	  driver.findElement(unem).sendKeys(username);
	  driver.findElement(pass).sendKeys(password);
	  driver.findElement(lob).click();
}
  @DataProvider(name="logindata")
  public Object[][]logindata(){
	  
	  Object[][]data=new Object[2][2];
	  data[0][0]="natsimhachary@gamial";
	  data[0][1]="dsgjb";
	  data[1][0]="anusharani@gmail.com";
	  data[1][1]="gkshgfiw";
	  return data;
  }
}
