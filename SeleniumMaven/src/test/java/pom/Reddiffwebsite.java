package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiffwebsite {
	WebDriver browser;
	@BeforeTest
	public void precondition() {
		String str = "chrome";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
	    System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");  
	   if(str == "chrome") {
	   browser=  new ChromeDriver();//opens chrome
	   }else if(str == "firefox") {
	   browser =  new FirefoxDriver();//opens firefox   
	   }else if(str == "edge") {
	   browser= new EdgeDriver();
	   }else {
		   System.out.println("Choose the right browser");
	   }
	}
	@Test(priority =1)
	public void openurl() {
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.get("https://www.rediff.com/");
		String ActualResult = browser.getTitle();
		String ExpectedResult = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	@Test(priority =2)
	public void signin() {
		Homepage home = new Homepage(browser);
		home.signin();
		String ActualResult = browser.getTitle();
		String ExpectedResult = "Rediffmail";
		Assert.assertEquals(ActualResult,ExpectedResult);
	}
	@Test(priority =3)
	public void loginpage() {
		Loginpage login = new Loginpage(browser);
		login.username();
		login.password();
		//login.signinbutton();
	}
	@Test(priority =4)
	public void clickhomepage() {
		Loginpage login = new Loginpage(browser);
		login.clickrediff();
		String ActualResult = browser.getTitle();
		String ExpectedResult = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	@Test(priority =5)
	public void clickcreateaccount() {
		Homepage home = new Homepage(browser); 
		home.createaccount();
		//assert
		
	}
	@Test(priority =6)
	public void createaccount() {
		Createaccount ca =  new Createaccount(browser);
		ca.enterfullname();
		ca.enterpassword();
		//assert
	}
	@AfterTest
	public void closebrowser() {
		browser.close();
	}
}
