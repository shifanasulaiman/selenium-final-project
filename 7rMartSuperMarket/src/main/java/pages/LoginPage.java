package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert_popup;
	public void enter_username_field(String usernameField)
	{
		username.sendKeys(usernameField);
	}
	public void enter_password_field(String passwordField)
	{
		password.sendKeys(passwordField);
	}
	public void click_on_signinbutton()
	{
		signin.click();
	}
	public boolean is_dashboard_display()
	{
		return dashboard.isDisplayed();
	}
	public boolean is_alert_displayed_for_invalidCredentials()
	{   
		return alert_popup.isDisplayed();	
		
	}
	

}
