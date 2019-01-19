package pageobjecttest;
import base.CommonApi;
import basepage.LoginPage;
import database.ConnectToSqlDB;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = PageFactory.initElements(driver,
                LoginPage.class);
    }

     @Test
     public void loginPageTitleTest() throws Exception {

        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.connectToSqlDatabase();


        String title = loginPage.validateLoginPageTitle();
        System.out.println("Page Title:" + title);
        Thread.sleep(1000);
    }
      @Test
      public void testfacebookLogo() {

        loginPage.checkfacebookLogo();
    }
     @Test
       public void SearchTest() {

        loginPage.searchFriend();
    }

     @Test
     public void testfirstname() {

        loginPage.checkfirstname();
    }

    @Test
    public void Profile() {

        loginPage.checkfirstname();
    }

     @Test
     public void HomeTest() {
        loginPage.CheckHome();
    }

      @Test
      public void testFrienFriends() {

        loginPage.CheckFindFriends();
    }

      @Test
      public void testNewsFeed() {

        loginPage.CheckNewsFeed();
    }

       @Test
      public void testAddAccount() {
        loginPage.CheckAddAccount();
    }

     @Test
     public void testMessenger() {
        loginPage.CheckMesswnger();
    }

     @Test
     public void testGroups() {

        loginPage.CheckGroups();
    }

      @Test
      public void testGames() {

        loginPage.CheckGames();
    }

      @Test
     public void testInstagram() {

        loginPage.CheckInstagram();
     }

     @Test
     public void testMarketPlace() {
        loginPage.CheckMarketPlace();
     }

     @Test
     public void testHelp() {

        loginPage.CheckHelp();
     }

     @Test
     public void testAccountSecurity() {
       loginPage.CheckAccountSecurity();
     }

    @Test
     public void testTerms() {

       loginPage.CheckTerms();
     }

     @Test
      public void testAdChoices() {

        loginPage.CheckAdChoices();
    }

      @Test
      public void testLoginHelp() {
       loginPage.CheckLoginHelp();
    }
     @Test
      public void testFacebookLite() {
       loginPage.CheckFaceBookLite();
    }

     @Test
      public void testFrame() {
        loginPage.CheckFrame();
    }
     @Test
     public void testFundraisers() {
       loginPage.CheckFundraisers();
    }

     @Test
     public void testPrivacy() {

        loginPage.CheckPrivacy();
    }

      @Test
      public void testCreatePage() {
        loginPage.CheckCraetePage();
    }

     @Test
     public void testPageCategories() {
       loginPage.CheckPageCategories();
    }

       @Test
       public void testGetMessenger() {

        loginPage.Checkgetmessenger();
    }

      @Test
      public void testmyNameTag() {
      loginPage.CheckMyNameTag();
    }

      @Test
      public void testPhotoNvideo() {

        loginPage.CheckphotoNvideo();
    }

     @Test
      public void testAboutFacebook() {
      loginPage.CheckaboutFacebook();
    }
     @Test
     public void testDataPolicy() {

        loginPage.CheckdataPolicy();
     }
      @Test
      public void testCookiesPolicy() {
      loginPage.CheckcookiesPolicy();

    }
      @AfterMethod
      public void tearDom() {
      driver.quit();
}
}










