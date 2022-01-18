package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {
static WebDriver browser;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
    	   throw new Exception("Choose the right browser");
       }
       browser.get("https://mail.rediff.com/cgi-bin/login.cgi");
	   browser.findElement(By.name("login")).sendKeys("hello");
       

}
}