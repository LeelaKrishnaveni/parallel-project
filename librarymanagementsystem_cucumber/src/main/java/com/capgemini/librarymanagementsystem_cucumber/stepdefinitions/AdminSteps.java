package com.capgemini.librarymanagementsystem_cucumber.stepdefinitions;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.librarymanagementsystem_cucumber.testrunner.TestRunner;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminSteps extends TestRunner {

	@Before
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");

		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}




	@Given("^Admin is on Login page$") public void admin_is_on_Login_page()
			throws Throwable {

		// input[ @id='email'] Thread.sleep(5000); 
		String actual = driver.getTitle();
		String excepted = "LmsAngular";
		System.out.println(actual);
		assertTrue("The webpage is not a login page", actual.equals(excepted));

	}

	@When("^Admin enters \"([^\"]*)\",\"([^\"]*)\"$") public void
	admin_enters(String arg1, String arg2) throws Throwable { 
		WebElement email =driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("password")); 
		WebElement login =driver.findElement(By.xpath("//input[@class='btn float-right login_btn']"));
		action.moveToElement(email).sendKeys(arg1).perform();

		email.sendKeys(arg1); password.sendKeys(arg2); login.click(); }

	@Then("^Admin should be logged in$") public void admin_should_be_logged_in()
			throws Throwable {

		String actual = driver.getCurrentUrl();
		String excepted ="http://localhost:4200/login"; 
		System.out.println(actual);
		assertTrue("Admin logged in successfully",actual.equals(excepted)); }


	@Given("^Admin is on adding book page$") public void
	admin_is_on_adding_book_page() throws Throwable {

		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Book')]")).click(); 
	}

	@When("^Admin enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void admin_enters(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {


		driver.findElement(By.id("bookName")).sendKeys(arg1);
		driver.findElement(By.id("authorName")).sendKeys(arg2);
		driver.findElement(By.id("bookCategory")).sendKeys(arg3); 
		driver.findElement(By.id("publisherName")).sendKeys(arg4);
		driver.findElement(By.
				xpath("//button[@class='btn btn-primary float-right']")).click();

	}

	@Then("^Book should be added$") public void book_should_be_added() throws
	Throwable { Thread.sleep(3000);

	String actual = driver.switchTo().alert().getText(); Thread.sleep(3000);
	String excepted = "Book Added Successfully"; System.out.println(actual);
	driver.switchTo().alert().accept(); assertTrue("Book Added successfully",
			actual.equalsIgnoreCase(excepted)); driver.close();


	}



//	@Given("^Admin is on removing book page$") public void
//	admin_is_on_removing_book_page() throws Throwable {
//
//		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Remove Book')]")).click();
//		driver.findElement(By.xpath("//tr[6]//td[6]//button[1]")).click();
//
//
//
//	}
//
//	@When("^Admin clicks on remove book$") public void admin_clicks_on_remove_book() throws Throwable {
//
//	}
//
//	@Then("^Book deleted successfully$") public void book_deleted_successfully()
//			throws Throwable { Thread.sleep(3000);
//
//	}
//
//
//
//	@Given("^Admin is on updating book page$") public void
//	admin_is_on_updating_book_page() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Update Book')]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		}
//
//	@When("^Admin enters (\\d+),\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$"	) 
//	public void admin_enters(int arg1, String arg2, String arg3, String arg4,String arg5) throws Throwable {
//		driver.findElement(By.id("bookName")).clear();
//		driver.findElement(By.id("bookName")).sendKeys(arg2);
//
//		driver.findElement(By.id("authorName")).clear();
//		driver.findElement(By.id("authorName")).sendKeys(arg3);
//
//		driver.findElement(By.id("bookCategory")).clear();
//		driver.findElement(By.id("bookCategory")).sendKeys(arg4);
//
//		driver.findElement(By.id("publisherName")).clear();
//		driver.findElement(By.id("publisherName")).sendKeys(arg5);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); }
//
//	@Then("^Book updated successfully$") 
//	public void book_updated_successfully() throws Throwable { 
//		Thread.sleep(3000); 
//		}
//
//
//
//	@Given("^Admin is on  viewing books page based on names$") public void
//	admin_is_on_viewing_books_page_based_on_names() throws Throwable {
//
//		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Book Details')]")).click();
//
//
//	}
//
//	@When("^Admin enters \"([^\"]*)\"$") public void admin_enters(String arg1)
//			throws Throwable {
//
//		driver.findElement(By.name("//input[@placeholder='search']")).sendKeys(arg1);
//		driver.findElement(By.xpath("//td[contains(text(),'history')]")).getText().
//		trim(); 
//		}
//
//	@Then("^show books based on name$") public void show_books_based_on_name()
//			throws Throwable { 
//		String actualBookName =	driver.findElement(By.xpath("//td[contains(text(),'history')]")).getText().
//			trim(); String expectedBookName = "history";
//			assertTrue("Admin Searched A Book By Name",actualBookName.equals(expectedBookName));
//
//	}
//
//
//	@Given("^Admin is on  viewing books page$") public void
//	admin_is_on_viewing_books_page() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Book Details')]")).click();
//		//driver.findElement(By.xpath("//a[contains(text(),'STUDENT')]")).click(); }
//	}
//	@When("^Admin  clicks on show books$") 
//	public void admin_clicks_on_show_books() throws Throwable {
//
//	}
//
//	@Then("^Admin  viewed booked sucessfully$") public void
//	admin_viewed_booked_sucessfully() throws Throwable { Thread.sleep(3000); }
//
//	@Given("^Admin  is on issuing book page$")
//	public void admin_is_on_issuing_book_page() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Show Requests')]")).click();
//		driver.findElement(By.xpath("//tr[1]//td[6]//button[1]")).click();
//	}
//
//	@When("^Admin  move hover on issuse$")
//	public void admin_move_hover_on_issuse() throws Throwable {
//
//	}
//
//	@Then("^Book issued successfully$")
//	public void book_issued_successfully() throws Throwable {
//
//		Thread.sleep(3000);
//	}
//	@Then("^close browser page$")
//	public void close_browser_page() throws Throwable {
//		Thread.sleep(2000);
//		driver.close();
//	}

}