package org.qualitymatrix.selenium.com.demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://shopping.rediff.com/login");
		//global wait
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.findElement(By.name("logid")).sendKeys("hello@rediffmail");
	}

}
