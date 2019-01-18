package basepage;

import base.CommonApi;
import dataReader.XlsxData;
import junit.awtui.Logo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.FbUtility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonApi {
    @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
    public static WebElement loginPageTitle;
    @FindBy(id = "email")
    WebElement username;
    @FindBy(id = "pass")
    WebElement password;

    public String validateLoginPageTitle() {
        username.sendKeys("miah_monir@yahooo.com");
        password.sendKeys("rahimam12");
        loginBtn.click();
        return driver.getTitle();
    }

    @FindBy(xpath = "//input[@id='u_0_2']")
    public static WebElement loginBtn;

    public void checkloginButton() {
        loginBtn.click();

    }

    @FindBy(xpath = "//i[@class='fb_logo img sp_z3EmYTfbUVU sx_6a42ec']")
    public static WebElement facebookLogo;

    public void checkfacebookLogo() {
        facebookLogo.click();
    }

    //Search Friends
    @FindBy(linkText = "Find Friends")
    public static WebElement Search;

    public void searchFriend() {
        validateLoginPageTitle();
        wait.until(ExpectedConditions.visibilityOf(Search));
        Search.sendKeys("Barak Obama");
    }

    //Create new Account
    @FindBy(name = "websubmit")
    public static WebElement signUp;
    @FindBy(name = "firstname")
    public static WebElement firstname;
    @FindBy(name = "lastname")
    public static WebElement lastname;
    @FindBy(name = "reg_email__")
    public static WebElement signupemail;
    @FindBy(name = "reg_passwd__")
    public static WebElement newpassword;
    @FindBy(id = "month")
    public static WebElement month;
    @FindBy(id = "day")
    public static WebElement day;
    @FindBy(id = "year")
    public static WebElement year;
    @FindBy(id = "u_0_a")
    public static WebElement genderMale;
    @FindBy(name = "reg_email_confirmation__")
    public static WebElement resignupemail;

    public String checkfirstname() {
        firstname.sendKeys("Monir", Keys.ENTER);
        lastname.sendKeys("Miah", Keys.ENTER);
        signupemail.sendKeys("monir.miah0910@gmail.com", Keys.ENTER);
        resignupemail.sendKeys("monir.miah0910@gmail.com", Keys.ENTER);
        newpassword.sendKeys("abcd123456", Keys.ENTER);
        month.sendKeys("May");
        day.sendKeys("6");
        year.sendKeys("1997");
        genderMale.click();
        signUp.click();
        return driver.getTitle();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]")
    public static WebElement Profile;

    public void checkProfile() {
        Profile.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public static WebElement Home;

    public void CheckHome() {

    }

    @FindBy(linkText = "Find Friends")
    public static WebElement FindFriends;
    public void CheckFindFriends() {
        FindFriends.click();
    }

    @FindBy(xpath = "//div[contains(text(),'News Feed')]")
    public static WebElement NewsFeed;

    public void CheckNewsFeed() {
    }

    @FindBy(xpath = "//div[@class='_1gaz _1ga- _50f6']")
    public static WebElement AddAccount;

    public void CheckAddAccount() {

    }

    @FindBy(xpath = "//a[@title='Check out Messenger.']")
    public static WebElement Messenger;

    public void CheckMesswnger() {
    }

    @FindBy(xpath = "//a[@title='Browse our Groups directory.']")
    public static WebElement Groups;

    public void CheckGroups() {
    }

    @FindBy(xpath = "//a[@title='Check out Facebook games.']")
    public static WebElement Games;

    public void CheckGames() {
    }

    @FindBy(xpath = "//a[@title='Check out Instagram']")
    public static WebElement Instagram;

    public void CheckInstagram() {
    }

    @FindBy(xpath = "//a[@title='Browse our marketplace product directory.']")
    public static WebElement MarketPlace;

    public void CheckMarketPlace() {
    }

    @FindBy(xpath = "//a[@title='Visit our Help Center.']")
    public static WebElement Help;

    public void CheckHelp() {
    }

    @FindBy(xpath = "//a[contains(text(),'Account Security')]")
    public static WebElement AccountSecurity;

    public void CheckAccountSecurity() {
        AccountSecurity.click();
    }

    @FindBy(xpath = "//a[@title='Review our terms and policies.']")
    public static WebElement Terms;

    public void CheckTerms() {
    }

    @FindBy(xpath = "//a[@title='Learn about Ad Choices.']")
    public static WebElement AdChoices;

    public void CheckAdChoices() {
    }

    @FindBy(xpath = "//a[contains(text(),'Login Help')]")
    public static WebElement LoginHelp;

    public void CheckLoginHelp() {
    }

    @FindBy(xpath = "//a[@title='Facebook Lite for Android.']")
    public static WebElement FacebookLite;

    public void CheckFaceBookLite() {
    }

    @FindBy(xpath = "//div[@class='_4-u5 _2pi6']")
    public static WebElement Frame;

    public void CheckFrame() {
    }

    @FindBy(xpath = "//a[@title='Donate to worthy causes.']\n" + "}")
    public static WebElement Fundraisers;

    public void CheckFundraisers() {
    }

    @FindBy(xpath = "//a[@title='Learn about your privacy and Facebook.']")
    public static WebElement privacy;

    public void CheckPrivacy() {
        privacy.click();
    }

    @FindBy(xpath = "//a[@title='Create a Page']")
    public static WebElement createPage;

    public void CheckCraetePage() {
        createPage.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Page Categories')]")
    public static WebElement pageCategories;

    public void CheckPageCategories() {
        pageCategories.click();
    }

    @FindBy(xpath = "//a[@title='Check out Messenger.']")
    public static WebElement getMessenger;

    public void Checkgetmessenger() {
        getMessenger.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Forgot account?')]")
    public static WebElement forgetPassword;

    public void CheckForgetPassword() {
        forgetPassword.click();

    }

    @FindBy(xpath = "//div[@class='_1gaz _c24 _50f6']")
    public static WebElement myNameTag;
    public void CheckMyNameTag() {
    }

    @FindBy(xpath = "//input[@id='js_d']")
    public static WebElement photoNvideo;
    public void CheckphotoNvideo() {
    }

    @FindBy(xpath = "//a[@title='Read our blog, discover the resource center, and find job opportunities.']")
    public static WebElement aboutFacebook;
    public void CheckaboutFacebook() {
        aboutFacebook.click();
    }

    @FindBy(xpath = "//a[@id='privacy-link']")
    public static WebElement dataPolicy;

    public void CheckdataPolicy() {
        dataPolicy.click();
    }

    @FindBy(xpath = "//a[@id='cookie-use-link']")
    public static WebElement cookiesPolicy;

    public void CheckcookiesPolicy() {
        cookiesPolicy.click();


    }


}











