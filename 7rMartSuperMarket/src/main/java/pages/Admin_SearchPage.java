package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class Admin_SearchPage
{
	WebDriver driver;
	public Admin_SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminusermoreinfolink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement adminsearch;
    @FindBy(xpath="//input[@id='un']") WebElement admin_search_username;
    @FindBy(xpath="//select[@id='ut']") WebElement admin_search_usertype;
    @FindBy(xpath="//button[@value='sr']") WebElement searchadminresult;
    @FindBy(xpath="//a[@class='btn btn-default btn-fix']") WebElement admin_reset;
    @FindBy(xpath="//span[@id='res']") WebElement resultnotfound;
    public void is_user_able_to_click_admin_user_link()
    {
    	adminusermoreinfolink.click();
    }
    public boolean is_search_button_visible()
    {
    	return adminsearch.isDisplayed();
    }
    public void is_user_able_to_click_adminsearchButton()
    {
    	adminsearch.click();
    }
    public void is_user_able_to_enter_the_user_name(String serach_username_field)
    {
    	admin_search_username.sendKeys(serach_username_field);
    }
    public void is_user_able_to_select_the_user_type(String searchusertype)
    {
    	PageUtility pageutilities = new PageUtility(driver);
    	pageutilities.selectByvalueofElement(admin_search_usertype, searchusertype);
    }
    public void is_user_able_to_click_the_search_button()
    {
    	searchadminresult.click();
    }
    public void is_user_able_click_the_resetbutton()
    {
    	admin_reset.click();
    }
    public boolean is_result_not_found_error_message_displayed()
    {
    	return resultnotfound.isDisplayed();
    	
    }
    
}

