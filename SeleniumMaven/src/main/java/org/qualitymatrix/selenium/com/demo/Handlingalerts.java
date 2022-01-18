package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://echoecho.com/javascript4.htm");
		chrome.findElement(By.name("B2")).click();
		
		System.out.println(chrome.switchTo().alert().getText());
		chrome.switchTo().alert().dismiss();
	}

}
