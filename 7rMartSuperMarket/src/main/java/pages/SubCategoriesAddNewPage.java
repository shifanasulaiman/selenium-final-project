package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtility;
import utilities.Wait_Utility;

public class SubCategoriesAddNewPage
{

	public WebDriver driver;
	private Wait_Utility wait;

	public SubCategoriesAddNewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new Wait_Utility(); // Initialize WaitUtility instance here
	}
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']") WebElement SubCategoryMoreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement addNewButton;
	@FindBy(xpath = "//select[@name='cat_id']")WebElement selectCategory;
	@FindBy(xpath = "//input[@id='subcategory']")WebElement subCategoryField;
	@FindBy(xpath = "//input[@name='main_img']")WebElement chooseFile;
	@FindBy(xpath = "//button[text()='Save']")WebElement saveButton;
	
	public void is_user_able_to_open_the_subcategoryPage()
	{
		SubCategoryMoreinfo.click();
	}
	public void SubCategoriesAddNewPageclickAddNewButton()
	{
		wait.waitforvisibilityofWebElement(driver, addNewButton);
		addNewButton.click();
	}
	public void verify_user_able_to_select_the_category(int subcategoryValue)
	{
		wait.waitforvisibilityofWebElement(driver, selectCategory);
		PageUtility pageutilities = new PageUtility(driver);
		pageutilities.selecttheElementBytheIndexValue(selectCategory, subcategoryValue);
	}
	public void verify_user_is_able_to_enter_thevalue_subcategory(String subcategoryvalue)
	{
		wait.waitforvisibilityofWebElement(driver, subCategoryField);
		subCategoryField.sendKeys(subcategoryvalue);
	}
	public void verify_user_is_able_to_upload_the_file(String IMAGEUPLOADPATH)
	{
		wait.waitforElementTobeClickable(driver, chooseFile);
		chooseFile.sendKeys(IMAGEUPLOADPATH);
	}
	public void verify_user_is_able_to_save_the_subcategory_field()
	{
		wait.waitforvisibilityofWebElement(driver, saveButton);
		saveButton.click();
		
	}
}
