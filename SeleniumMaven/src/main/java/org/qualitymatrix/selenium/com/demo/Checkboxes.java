package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://echoecho.com/htmlforms09.htm");
		chrome.findElement(By.name("option1")).click();//Milk 
		//chrome.findElement(By.name("option2")).click();
		System.out.println(chrome.findElement(By.name("option1")).getAttribute("checked"));
		chrome.findElement(By.name("option3")).click();
	}

}
