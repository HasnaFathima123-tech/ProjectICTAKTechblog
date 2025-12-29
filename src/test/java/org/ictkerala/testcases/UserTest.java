package org.ictkerala.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.ictkerala.base.TestBase;
import org.ictkerala.pages.UserAdminMsgs;
import org.ictkerala.pages.UserCategory;
import org.ictkerala.pages.UserHomePage;
import org.ictkerala.pages.UserLoginPage;
import org.ictkerala.pages.UserMyPost;
import org.ictkerala.pages.UserNewPost;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)

public class UserTest extends TestBase{
	
     UserLoginPage obj;
     UserHomePage kms;
     UserNewPost pst;
     UserMyPost syt;
     UserAdminMsgs wbt;
     UserCategory gbt;
     @BeforeClass
public void objInt() {
	obj=new UserLoginPage(driver);
	kms=new UserHomePage(driver);
	pst=new UserNewPost(driver);
	syt=new UserMyPost(driver);
	wbt=new UserAdminMsgs(driver);
	gbt=new UserCategory(driver);
}
     @Test(priority=1)
     public void tc001() {
    	 obj.dropdown();
    	 obj.loginPage("hasna@gmail.com", "Hasna12345");
    	 obj.clickbtn();
     }
     @Test(priority=2)

     public void tc002() {
    	 kms.clckHome();
    	 
     }
     @Test(priority=3)
     public void tc003() {
    	 pst.newPost();
    	 pst.addPost("Sample", "https://www.bigfootdigital.co.uk/wp-content/uploads/2020/07/image-optimisation-scaled.jpg", "THis is demo");;
     }
     @Test(priority=4)
     public void tc004() {
    	 syt.clickMyPost();
     }
     @Test(priority=5)
     public void tc005() {
    	 wbt.UserAdminMsgs();
    	 wbt.isadminDisplayed();
     }
     @Test(priority=6)
     public void tc006() {
    	 gbt.category();
    	 gbt.selectCat();
     }
}