package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver browser;
	public Loginpage(WebDriver browser) {
		this.browser = browser;
	}
public void username() {
	browser.findElement(By.name("login")).sendKeys("abcd");
}
public void password() {
	browser.findElement(By.name("passwd")).sendKeys("1234");
}
public void signinbutton() {
	browser.findElement(By.name("proceed")).click();
}
public void clickrediff() {
	browser.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/a")).click();
}
}
