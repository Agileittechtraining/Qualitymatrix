package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccount {
	WebDriver browser;
public Createaccount(WebDriver browser) {
	 this.browser = browser;
}

public void enterfullname() {
	browser.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Hello Hi");
}
public void enterpassword() {
	browser.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("Hello Hi");
}
}
