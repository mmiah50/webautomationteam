package basepage;

import base.CommonApi;
import junit.awtui.Logo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
        return driver.getTitle();
    }

    //logo
    @FindBy(xpath = "//i[@class='fb_logo img sp_DM94Tzbs4_7 sx_0d58d6']")
    public static WebElement facebookLogo;

    public void checkfacebookLogo() {
        facebookLogo.click();
    }
    /*@FindBy (xpath = "//span[@class='_2md']")
    public static WebElement homeLogo;
    public void checkhomeLogo() {
        homeLogo.click();
    }*/

    //Search Friends
    @FindBy(linkText = "Find Friends")
    public static WebElement Search;

    public void searchFriend() {
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
    @FindBy(xpath = "//html[@id='facebook']//div[@id='u_0_g']/a[@href='https://www.facebook.com/?ref=tn_tnmn']")
      public static WebElement Home;
    public void CheckHome() {
        Home.click();
    }

    @FindBy(linkText = "Find Friends")
    public static WebElement FindFriends;
    public void CheckFindFriends() {
        FindFriends.click();
    }

    @FindBy(css ="body.hasLeftCol._2yq.home.composerExpanded._5vb_.fbx._-kb._61s0._605a.m_13pksao2xn.chrome.webkit.win.x1.Locale_en_US:nth-child(2) div._li:nth-child(1) div._21dp div._2t-8._1s4v._2s1x._h2p div._2t-a._26aw._5rmj._50ti._2s1y div._2t-a._50tj div._2t-a._4pmj._2t-d div._2t-f div._cy6:nth-child(1) div._4kny._2s24:nth-child(4) div._3qcu._cy7 > a._2s25")
    public static WebElement NewsFeed;
    public void CheckNewsFeed() {
        NewsFeed.click();

    }

    @FindBy(xpath= "//div[@class='_1gaz _1ga- _50f6']")
    public static WebElement AddAccount;
    public void CheckAddAccount() {
        AddAccount.click();

    }


}





















