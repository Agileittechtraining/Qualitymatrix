package org.qualitymatrix.selenium.com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://echoecho.com/htmlforms10.htm");
		List<WebElement> l = chrome.findElements(By.name("group1"));// cheese
	    System.out.println(l.size());
	    l.get(2).click();
		List<WebElement> l2 = chrome.findElements(By.name("group2"));// water
	    System.out.println(l2.size());
	    l2.get(1).click();
	}

}
