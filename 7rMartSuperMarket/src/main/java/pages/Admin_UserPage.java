package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class Admin_UserPage 
{
	WebDriver driver;
	public Admin_UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement admin_user;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") WebElement adminUserName;
	@FindBy(xpath="//input[@id='password']")WebElement adminPassword;
	@FindBy(xpath="//select[@id='user_type']") WebElement usertype;
	@FindBy(xpath="//button[@name='Create']") WebElement create;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement userCreateConfirmation;
	public void isUser_user_is_able_to_clickOn_AdminUserInfo_morelink()
	{
		admin_user.click();
		
	}
	public void is_user_is_able_to_clickOn_AdminUser_NewButton()
	{
		newbutton.click();
		
	}
	public void is_admin_able_enter_the_userName(String staffnameField)
	{
		adminUserName.sendKeys(staffnameField);
	}
	public void is_admin_able_enter_the_password(String staffPasswordField)
	{
		adminPassword.sendKeys(staffPasswordField);
	}
	public void selectAdmin_userType(String selectUserTypefromDropdown)
	{
		PageUtility pageutility=new PageUtility(driver);
		pageutility.selectByvalueofElement(usertype, selectUserTypefromDropdown);
	}
	public void is_user_able_to_click_the_create_button()
	{
		create.click();
	}
	public boolean getvalid_confirmationFrom_user_creation()
	{
		return userCreateConfirmation.isDisplayed();
	}

}
