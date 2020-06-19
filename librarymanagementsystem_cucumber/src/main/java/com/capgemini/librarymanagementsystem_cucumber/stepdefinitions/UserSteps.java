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
//import com.capgemini.librarymanagementsystem_cucumber.testrunner.UserTestRunner;
//
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class UserSteps extends UserTestRunner{
//	@Before
//	public void openBrowser() throws Exception {
//		driver = new ChromeDriver();
//		driver.get("http://localhost:4200/login");
//		wait = new WebDriverWait(driver, 10);
//		action = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//	@Given("^User is on Login page$")
//	public void user_is_on_Login_page() throws Throwable {
//
//				Thread.sleep(5000);
//				String actual = driver.getTitle();
//				String excepted = "LmsAngular";
//				System.out.println(actual);
//				assertTrue("The webpage is not a login page", actual.equals(excepted));
//	}
//
//	@When("^User enters \"([^\"]*)\",\"([^\"]*)\"$")
//	public void user_enters(String arg1, String arg2) throws Throwable {
//		WebElement email = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement login = driver.findElement(By.xpath("//input[@class='btn float-right login_btn']"));
//		action.moveToElement(email).sendKeys(arg1).perform();
//
//		email.sendKeys(arg1);
//		password.sendKeys(arg2);
//		login.click();
//	}
//
//	@Then("^User should be logged in$")
//	public void user_should_be_logged_in() throws Throwable {
//
//		String actual = driver.getCurrentUrl();
//		String excepted = "http://localhost:4200/login";
//		System.out.println(actual);
//		assertTrue("User logged in successfully", actual.equals(excepted));
//	}
//	@Given("^User is on request book page$")
//	public void user_is_on_request_book_page() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'User')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Request Book')]")).click();
//		driver.findElement(By.xpath("//tr[4]//td[6]//button[1]")).click();
//	}
//
//	@When("^User clicks on request button$")
//	public void user_clicks_on_request_button() throws Throwable {
//	    
//	}
//
//	@Then("^Book Requested Successfully$")
//	public void book_Requested_Successfully() throws Throwable {
//		Thread.sleep(30000);
//	}
//
//
//
//}
