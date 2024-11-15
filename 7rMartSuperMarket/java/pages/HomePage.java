package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement admin_user;

	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") WebElement admin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
    public void is_ableto_click_the_admin()
    {
    	admin.click();
    }
    public Admin_UserPage isUser_user_is_able_to_clickOn_AdminUserInfo_morelink()
	{
		admin_user.click();
		return new Admin_UserPage(driver);
		
	}
    public void is_ableTo_Logout()
    {
    	logout.click();
    }
}
