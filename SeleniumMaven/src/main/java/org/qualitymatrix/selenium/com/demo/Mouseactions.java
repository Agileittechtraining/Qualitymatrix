package org.qualitymatrix.selenium.com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.snapdeal.com/");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions a = new Actions(chrome);
		WebElement books = chrome.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[12]/a/span"));
	    a.moveToElement(books).build().perform();
	    WebElement music = chrome.findElement(By.xpath("//*[@id=\"category11Data\"]/div[3]/div/div/p[5]/a/span"));
	    a.moveToElement(music).click().build().perform();
	    WebElement leftbutton = chrome.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    a.dragAndDropBy(leftbutton, 50, 0).build().perform();
	}

}
