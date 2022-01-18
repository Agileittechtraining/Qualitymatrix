package org.qualitymatrix.testng;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poi.ExcelReader;


public class Loginpage {
	WebDriver browser;
@BeforeTest
public void precondition() {
	String str = "chrome";
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
    System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");  
   if(str == "chrome") {
   browser=  new ChromeDriver();//opens chrome
   }else if(str == "firefox") {
   browser =  new FirefoxDriver();//opens firefox   
   }else if(str == "edge") {
   browser= new EdgeDriver();
   }else {
	   System.out.println("Choose the right browser");
   }
}
@Test(priority =1)
public void openurl() {
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/login");
	String ActualResult = browser.getTitle();
	String ExpectedResult = "Login - PHPTRAVELS";
	Assert.assertEquals(ActualResult, ExpectedResult);
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void login() throws IOException {
	ExcelReader reader = new ExcelReader();
	String username = reader.excelreading("C:\\Filehandling\\Myfile.xlsx", "Mysheet 1", 1, 0);
	String password = reader.excelreading("C:\\Filehandling\\Myfile.xlsx", "Mysheet 1", 1, 1);
	browser.findElement(By.name("email")).sendKeys(username);
	browser.findElement(By.name("password")).sendKeys(password);
	browser.findElement(By.id("cookie_stop")).click();
	browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	String ActualResult = browser.getTitle();
	String ExpectedResult = "Dashboard - PHPTRAVELS";
	Assert.assertEquals(ActualResult, ExpectedResult);
}
@Test
public void logout() {
	browser.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[5]/a")).click();
}
@AfterTest
public void closebrowser() {
	browser.close();
}
}
