package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_SearchPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminSearch_Test extends Base
{
  @Test
  public void verify_user_is_able_search_an_adminuser() throws IOException 
  {
	  String username=ExcelUtility.getstringdata(1, 0,"loginpage");
		 String password=ExcelUtility.getstringdata(1, 1,"loginpage" );
		 String adminusername=ExcelUtility.getstringdata(1, 0, "adminsearchpage");
		 String adminusertype=ExcelUtility.getstringdata(1, 1, "adminsearchpage");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 Admin_SearchPage adminsearch=new Admin_SearchPage(driver);
		 adminsearch.is_user_able_to_click_admin_user_link();
		 Assert.assertTrue(adminsearch.is_search_button_visible(),Constant.ERROR_MESSAGE_FOR_SEARCH_BUTTON_NOT_VISIBLE);
		 adminsearch.is_user_able_to_click_adminsearchButton();
		 adminsearch.is_user_able_to_enter_the_user_name(adminusername);
		 adminsearch.is_user_able_to_select_the_user_type(adminusertype);
		 adminsearch.is_user_able_to_click_the_search_button();
		 Assert.assertTrue(adminsearch.is_result_not_found_error_message_displayed(),Constant.ERROR_MESSAGE_RESULT_NOT_FOUND);
		 adminsearch.is_user_able_click_the_resetbutton();
		 
  }
}
