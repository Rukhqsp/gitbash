package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinationclass {
	WebDriver driver;
	
	@Given("Login page must display")
	public void login_page_must_display() {
	    WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8888/");
	    Reporter.log("Login is done",true);
	}

	@When("Enter the valid username")
	public void enter_the_valid_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	    Reporter.log("enter the username",true);
	}

	@When("Enter the valid password")
	public void enter_the_valid_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
				
	    Reporter.log("enter the password",true);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	    Reporter.log("click on login button",true);
	}

	@Then("Home page must display")
	public void home_page_must_display() {
	  Reporter.log("homepage must be displayed",true);
	}
	@When("Enter the invalid password")
	public void enter_the_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Home page must not display")
	public void home_page_must_not_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the blank username")
	public void enter_the_blank_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the blank password")
	public void enter_the_blank_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the wrong username")
	public void enter_the_wrong_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the wring password")
	public void enter_the_wring_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
