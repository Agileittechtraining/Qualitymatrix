package org.qualitymatrix.selenium.com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinksfromarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://shopping.rediff.com/");
		WebElement link = chrome.findElement(By.id("popular_cat"));
	    List<WebElement> links = link.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    System.out.println(links.get(2).getText());
	}

}
