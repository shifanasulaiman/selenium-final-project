package testscript;




import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.CatgoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FileUpload_Utility;

public class Category_Test extends Base
{
  @Test
  @Parameters("image")
  public void verify_user_is_able_to_click_the_category(String image) throws AWTException, IOException
  {
	  String username=ExcelUtility.getstringdata(1,0,"loginpage" );
		 String password=ExcelUtility.getstringdata(1,1, "loginpage");
		 String category_field=ExcelUtility.getstringdata(1,0, "category");
		 //String image=ExcelUtility.getstringdata(1,1, "category");
	     LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();  
		 CatgoryPage categorypage=new CatgoryPage(driver);
		 categorypage.isUserAbleTo_ClicktheCategory_info_link();
		 categorypage.isUser_able_to_clickThe_New_button();
		 categorypage.isUser_able_to_enter_categoryFieldValue(category_field);
		 categorypage.isUser_able_to_click_the_selectGroup();
		 categorypage.is_user_able_to_upload_aFile();
		 FileUpload_Utility.uploadfile(image);
		 Assert.assertTrue(categorypage.is_category_is_created_with_file_upload(),Constant.ERROR_MESSAGE_FOR_FILE_UPLOAD);
		 
		 
		 
		 
  }
}
