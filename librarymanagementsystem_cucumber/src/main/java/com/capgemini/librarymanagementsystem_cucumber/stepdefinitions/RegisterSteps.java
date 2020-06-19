//package com.capgemini.librarymanagementsystem_cucumber.stepdefinitions;
//
//import static org.junit.Assert.assertTrue;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.capgemini.librarymanagementsystem_cucumber.testrunner.RegisterTestRunner;
//
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class RegisterSteps extends RegisterTestRunner{
//	@Before
//	public void openBrowser() throws Exception {
//		driver = new ChromeDriver();
//		driver.get("http://localhost:4200/register");
//		wait = new WebDriverWait(driver, 10);
//		action = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//	@Given("^User is on registration page$")
//	public void user_is_on_registration_page() throws Throwable {
//		Thread.sleep(5000);
//		String actual = driver.getTitle();
//		String excepted = "LmsAngular";
//		System.out.println(actual);
//		assertTrue("The webpage is not a register page", actual.equals(excepted));
//	}
//
//	@When("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",(\\d+),\"([^\"]*)\"$")
//	public void user_enters(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
//		Actions actions = new Actions(driver);
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("firstName")).sendKeys(arg1);
//
//
//		driver.findElement(By.id("lastName")).sendKeys(arg2);
//
//		driver.findElement(By.id("email")).sendKeys(arg3);
//
//		driver.findElement(By.id("password")).sendKeys(arg4);
//
//		driver.findElement(By.id("mobile")).sendKeys(arg5);
//
//		driver.findElement(By.id("role")).sendKeys(arg6);
//
//		WebElement register = driver.findElement(By.xpath("//button[@class='btn-btn-outline-dark float-right']"));
//		register.click();
//	}
//
//	@Then("^User should be \"([^\"]*)\"$")
//	public void user_should_be(String arg1) throws Throwable {
//		String actual = driver.getCurrentUrl();
//		String excepted = "http://localhost:4200/register";
//		System.out.println(actual);
//		assertTrue("User logged in successfully", actual.equals(excepted));
//
//		driver.close();
//
//	}
//
//}
