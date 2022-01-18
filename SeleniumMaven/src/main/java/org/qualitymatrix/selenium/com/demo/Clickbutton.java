package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://mail.rediff.com/cgi-bin/login.cgi");
		chrome.findElement(By.name("proceed")).click();
	}

}
