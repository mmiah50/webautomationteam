package basepage;

import base.CommonApi;
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




    }



















