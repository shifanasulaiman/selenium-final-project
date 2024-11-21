package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtility;


public class Admin_UserPage 
{
	WebDriver driver;
	public Admin_UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") WebElement adminUserName;
	@FindBy(xpath="//input[@id='password']")WebElement adminPassword;
	@FindBy(xpath="//select[@id='user_type']") WebElement usertype;
	@FindBy(xpath="//button[@name='Create']") WebElement create;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement userCreateConfirmation;

	public Admin_UserPage is_user_is_able_to_clickOn_AdminUser_NewButton()
	{
		newbutton.click();
		return this;
		
	}
	public Admin_UserPage is_admin_able_enter_the_userName(String staffnameField)
	{
		adminUserName.sendKeys(staffnameField);
		return this;
	}
	public Admin_UserPage is_admin_able_enter_the_password(String staffPasswordField)
	{
		adminPassword.sendKeys(staffPasswordField);
		return this;
	}
	public Admin_UserPage selectAdmin_userType(String selectUserTypefromDropdown)
	{
		PageUtility pageutility=new PageUtility(driver);
		pageutility.selectByVisibleTextofElement(usertype, selectUserTypefromDropdown);
		return this;
	}
	public Admin_UserPage is_user_able_to_click_the_create_button()
	{
		create.click();
		return this;
	}
	public boolean getvalid_confirmationFrom_user_creation()
	{   
		//PageUtility pageutility=new PageUtility(driver);
	    //pageutility.dismissAlert(userCreateConfirmation);
		return userCreateConfirmation.isDisplayed();
	}

}
