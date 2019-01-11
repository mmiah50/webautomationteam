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
    /*@FindBy(xpath ="//*[@id=\"js_10n\"]")
     public static WebElement Search;

    public void searchFriend() {
        Search.sendKeys("Barak Obama");
    }*/
    //signup
    @FindBy (name = "websubmit")
    public static WebElement signUp;

    @FindBy (name = "firstname")
     public static WebElement firstname;

    @FindBy (name = "lastname")
    public static WebElement lastname;

    @FindBy (name = "reg_email__")
    public static WebElement signupemail;

    @FindBy (name = "reg_passwd__")
    public static WebElement newpassword;

    @FindBy (id = "month")
    public static WebElement month;

    @FindBy (id = "day")
    public static WebElement day;

    @FindBy (id = "year")
    public static WebElement year;

    @FindBy (id = "u_0_a")
    public static WebElement genderMale;

    @FindBy (name = "reg_email_confirmation__")
    public static WebElement resignupemail;

    /*public void checkSignupPage() {
        firstname.sendKeys("Monir");

        lastname.sendKeys("Miah");
        signupemail.sendKeys("monir.miah0910@gmail.com");
        newpassword.sendKeys("abcd1234");
        month.sendKeys("March, Keys.ENTER");
        day.click();
        year.sendKeys("1997, Keys.ENTER");
        genderMale.sendKeys("Male, Keys.ENTER");
        signUp.click();

    }*/
    public String checkfirstname() {
        firstname.sendKeys("Monir", Keys.ENTER);
        lastname.sendKeys("Miah", Keys.ENTER);
        signupemail.sendKeys("monir.miah0910@gmail.com",Keys.ENTER);
        resignupemail.sendKeys("monir.miah0910@gmail.com",Keys.ENTER);
        newpassword.sendKeys("abcd123456", Keys.ENTER);
        month.sendKeys("May");
        day.sendKeys("6");
        year.sendKeys("1997");
        genderMale.click();
        signUp.click();

        return driver.getTitle();

    }








    }
























