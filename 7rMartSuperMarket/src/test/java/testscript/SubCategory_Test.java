package testscript;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.SubCategoriesAddNewPage;
import utilities.ExcelUtility;

public class SubCategory_Test extends Base
{
  @Test
  @Parameters({"category","subcategoryvalue","filepath"})
  public void verify_is_able_open_the_SubCAtegory_Page(int category, String subcategoryvalue, String filepath) throws IOException
  {
	     String username=ExcelUtility.getstringdata(1, 0,"loginpage");
		 String password=ExcelUtility.getstringdata(1, 1,"loginpage" );
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 SubCategoriesAddNewPage subcategory=new SubCategoriesAddNewPage(driver);
		 subcategory.is_user_able_to_open_the_subcategoryPage();
		 subcategory.SubCategoriesAddNewPageclickAddNewButton();
		 subcategory.verify_user_able_to_select_the_category(category);
		 subcategory.verify_user_is_able_to_enter_thevalue_subcategory(subcategoryvalue);
		 subcategory.verify_user_is_able_to_upload_the_file(filepath);
		 subcategory.verify_user_is_able_to_save_the_subcategory_field();

  }
}
