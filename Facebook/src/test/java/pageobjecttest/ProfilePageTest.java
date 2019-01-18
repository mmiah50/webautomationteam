//package pageobjecttest;
//
//import base.CommonApi;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class ProfilePageTest {
//    public class ProfilePageTest extends CommonApi {
//        ProfilePage profilePage;
//        Signup.signup signup;
//        NewFeedPage newsFeedPage;
//        @BeforeMethod
//        public void setupProfilepagetest() throws InterruptedException {
//            profilePage = new ProfilePage();
//            signup = new SignUp.Signup();
//            newsFeedPage = new NewsFeedPage();
//            signup.login();
//            newsFeedPage.landinonprofile();
//        }
//        @Test(priority = 30)
//        public void getTitleTest() throws InterruptedException {
//            Thread.sleep(1000);
//            String actual= profilePage.validateLoginPageTitle();
//            Assert.assertEquals(actual,"Seleium");
//        }
//    }
//
//}
