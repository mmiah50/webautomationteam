package pageobjecttest;

import base.CommonApi;
import basepage.LoginPage;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {

    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);

    }

    @Test
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        System.out.println("Page Title:" + title);
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
    public void testInstagram(){
    loginPage.CheckInstagram();
    }
    @Test
    public void testMarketPlace(){
      loginPage.CheckMarketPlace();

        }
    @Test
    public void testHelp() {
        loginPage.CheckHelp();
    }
}














