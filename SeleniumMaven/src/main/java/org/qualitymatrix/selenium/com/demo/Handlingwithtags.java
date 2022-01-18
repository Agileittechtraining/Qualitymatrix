package org.qualitymatrix.selenium.com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwithtags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://echoecho.com/htmlforms11.htm");
		WebElement dropdown = chrome.findElement(By.name("dropdownmenu"));
		List<WebElement> l = dropdown.findElements(By.tagName("option"));
	    System.out.println(l.size());
	    for(int i=0;i<l.size();i++) {
	    	System.out.println(l.get(i).getText());
	    }
	}

}
