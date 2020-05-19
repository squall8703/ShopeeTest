package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Loginpage;

public class testStep {
	
	public WebDriver driver;
	
	@Given("User on Home Page")
	public void user_on_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
	}
	
	@When("^User Enters \"([^\"]*)\" and \"([^\"]*)\" to username and password fields$")
	public void user_Enters_and_to_username_and_password_fields(String username, String password) throws Throwable {
	    Loginpage lg = new Loginpage(driver);
	    lg.enter_username(username);
	    lg.enter_password(password);
		lg.click_login();
		throw new PendingException();
	}
	
	@Then("^User Verifies the header is \"([^\"]*)\"$")
	public void user_Verifies_the_header_is(String title) throws Throwable {
		Loginpage lg = new Loginpage(driver);
	    String actual_title = lg.get_title();
		Assert.assertEquals(title, actual_title);
		throw new PendingException();
	}

	
}
