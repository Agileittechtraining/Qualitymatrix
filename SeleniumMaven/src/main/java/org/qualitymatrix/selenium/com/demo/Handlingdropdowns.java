package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://echoecho.com/htmlforms11.htm");
		chrome.findElement(By.name("dropdownmenu")).sendKeys("Cheese");
	}

}
