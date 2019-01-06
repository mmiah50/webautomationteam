package pageNobject;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignInPage extends CommonApi {

    @FindBy(id = "username")
    public static WebElement username;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(xpath = ".//*[@id='userForm']/fieldset[2]/div/span/button")
    public static WebElement loginbutton;
    @FindBy(xpath = ".//*[@id='c1353257994291']/div[1]/ul/li[2]//a")
    public static WebElement how2Regrister;
    @FindBy(xpath = ".//*[@id='mycigna-learn-register']/div/a[1]")
    public static WebElement regNow;

}







