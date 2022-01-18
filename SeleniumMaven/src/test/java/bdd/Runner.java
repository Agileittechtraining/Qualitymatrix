package bdd;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login.feature"}, plugin = {"pretty","html:target/reports.html"})
public class Runner extends AbstractTestNGCucumberTests {

}
