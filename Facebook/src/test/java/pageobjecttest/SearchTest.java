package pageobjecttest;

import base.CommonApi;
import basepage.SearchFriend;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static basepage.LoginPage.loginBtn;
public class SearchTest<prefs> extends SearchFriend {


    /*@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
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
    }*/
    SearchFriend SF;

    @BeforeMethod
    public void initElements() {
        SF = PageFactory.initElements(driver, SearchFriend.class);

//        ChromeOptions options=new ChromeOptions();
//        Map<String, Object> prefs=new HashMap<String,Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 1);
//            //  1-Allow, 2-Block, 0-default
//        options.setExperimentalOption("prefs",prefs);
//        ChromeDriver driver=new ChromeDriver(options);

    }
           /* @Test
        public void test(){
         SF.Search();
         SF.btn();

        }*/
           @Test
    public void testSearch() {
               ChromeOptions options=new ChromeOptions();
               Map<String, Object> prefs=new HashMap<String,Object>();
               prefs.put("profile.default_content_setting_values.notifications", 1);
               SF.Search();
           }


    }




