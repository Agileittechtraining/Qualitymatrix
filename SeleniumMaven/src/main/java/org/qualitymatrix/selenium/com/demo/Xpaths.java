package org.qualitymatrix.selenium.com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//chrome.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Hello Hi ");
		chrome.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Hello Hi ");
	    System.out.println(chrome.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[3]/td[5]/font")).getText());
	}

}
