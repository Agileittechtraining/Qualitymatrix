package org.qualitymatrix.selenium.com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> Companyname = chrome.findElements(By.xpath("//*[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> Price = chrome.findElements(By.xpath("//*[@class = 'dataTable']/tbody/tr/td[4]"));
	    for(int i=0;i<Companyname.size();i++) {
	    	System.out.print(Companyname.get(i).getText()+ "--->");
	        System.out.println(Price.get(i).getText());
	    }
	}

}
