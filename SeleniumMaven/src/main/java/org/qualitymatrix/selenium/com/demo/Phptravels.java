package org.qualitymatrix.selenium.com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://phptravels.org/register.php");
		WebElement name = chrome.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[1]/div[2]/div/div[4]/div/div/div/div/div[3]"));
	    name.click();
	    WebElement cn = chrome.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/ul"));
		List<WebElement> country = cn.findElements(By.tagName("li"));
	    country.get(246).click();
	 	}

}
