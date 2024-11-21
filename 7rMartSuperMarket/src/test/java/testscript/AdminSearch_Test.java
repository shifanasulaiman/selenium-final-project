package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_SearchPage;
import pages.HomePage;
import pages.LoginPage;


public class AdminSearch_Test extends Base
{
	HomePage homepage;
	Admin_SearchPage adminsearch;
  @Test
  @Parameters({"username","password","adminusername","adminusertype"})
  public void verify_user_is_able_search_an_adminuser(String username,String password, String adminusername,String adminusertype) throws IOException 
  {
	    /* String username=ExcelUtility.getstringdata(1, 0,"loginpage");
		 String password=ExcelUtility.getstringdata(1, 1,"loginpage" );
		 String adminusername=ExcelUtility.getstringdata(1, 0, "adminsearchpage");
		 String adminusertype=ExcelUtility.getstringdata(1, 1, "adminsearchpage");*/
		 
		 
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username).enter_password_field(password);
		 homepage=loginpage.click_on_signinbutton();
		 adminsearch=homepage.is_user_able_to_click_admin_user_link();
	     adminsearch.is_user_able_to_click_adminsearchButton().is_user_able_to_enter_the_user_name(adminusername).is_user_able_to_select_the_user_type(adminusertype).is_user_able_to_click_the_search_button();
		 Assert.assertTrue(adminsearch.is_result_not_found_error_message_displayed(),Constant.ERROR_MESSAGE_RESULT_NOT_FOUND);
		 adminsearch.is_user_able_click_the_resetbutton();
		 
  }
}
