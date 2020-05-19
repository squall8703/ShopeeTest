package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(how = How.NAME, using = "userName")
    WebElement txt_username;
	
	@FindBy(how = How.NAME, using = "password")
    WebElement txt_password;

	@FindBy(how = How.NAME, using = "login")
    WebElement btn_login;
	

	
	
	public void enter_username(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enter_password(String password) {
		txt_password.sendKeys(password);
	}
	
	
	public void click_login() {
		btn_login.click();
	}
	
	public String get_title() {
		return driver.getTitle();
	}
	
}
