package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Wait_Utility;

public class CatgoryPage
{   
	WebDriver driver;
	public Wait_Utility wait;
	public CatgoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer'][1]") WebElement categoryinfoLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']") WebElement new_category;
	@FindBy(xpath="//input[@id='category']") WebElement  category_field;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement selectGroup;
	@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']") WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert_category;
	public void isUserAbleTo_ClicktheCategory_info_link()
	{
		categoryinfoLink.click();
	}
	public void isUser_able_to_clickThe_New_button()
	{
		new_category.click();
	}
	public void isUser_able_to_enter_categoryFieldValue(String categoryFieldValue)
	{
		category_field.clear();
		category_field.sendKeys(categoryFieldValue);
	}
	public void isUser_able_to_click_the_selectGroup()
	{
		selectGroup.click();
	}
	public void is_user_able_to_upload_aFile()
	{   
		wait.waitforElementTobeClickable(driver, choosefile);
		choosefile.click();	
	}
	public void is_user_able_to_save_the_category()
	{
		savebutton.click();
	}
	public boolean is_category_is_created_with_file_upload()
	{   
		return alert_category.isDisplayed();	
		
	}
	
	
}
