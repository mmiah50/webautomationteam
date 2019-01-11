package pageobjecttest;

import base.CommonApi;
import basepage.LoginPage;
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


        }












