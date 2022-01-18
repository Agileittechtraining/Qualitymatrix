package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravelslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.phptravels.net/login");
		chrome.findElement(By.name("email")).sendKeys("user@phptravels.com");
		chrome.findElement(By.name("password")).sendKeys("demouser");
		chrome.findElement(By.id("cookie_stop")).click();
		chrome.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	}

}
