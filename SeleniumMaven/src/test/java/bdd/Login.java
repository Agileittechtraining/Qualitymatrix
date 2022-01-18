package bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
@Before
public void initializebrowser() {
	System.out.println("Initialized Browser Successfully");
}
@Given("To open a browser")
public void open_a_browser() {
	System.out.println("Opened Browser Successfully");
}
@And("To open Url of application")
public void openurl() {
	System.out.println("URL Opened Successfully");
}
@When("I enter username into the usernamefield of application")
public void enterusername() {
	System.out.println("Entered Username");
}
@And("I enter password into the passwordfield of application")
public void enterpassword() {
	System.out.println("Entered password");
}

@And("I click on ok button")
public void clickok() {
	System.out.println("Clicked OK");
}
@Then("I validates the dashboard is openened")
public void dashboardopen() {
	System.out.println("Dashboard open successful");
}
@After
public void postcondition() {
	System.out.println("Browser close successful");
}
}
