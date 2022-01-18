package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver browser;
	public Homepage(WebDriver browser) {
		this.browser = browser;
	}
public void signin() {
	browser.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
    
}
public void createaccount() {
	browser.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
}
}
