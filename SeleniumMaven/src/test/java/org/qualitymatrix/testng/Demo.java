package org.qualitymatrix.testng;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
@Test(priority = 1)
public void openurl() {
	Assert.assertEquals("A", "A"); //hard assertions
	System.out.println("Openend URL successfully");
}
@Test(priority = 2)
public void findelement() {
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("A", "B");
	System.out.println("Found an element");
	sa.assertAll();
}
@BeforeTest
public void beforetest() {
	System.out.println("This is from beforetest");
}
@AfterTest
public void aftertest() {
	System.out.println("This is from aftertest");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from aftersuite");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from afterclass");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from beforemethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from aftermethod");
}
}
