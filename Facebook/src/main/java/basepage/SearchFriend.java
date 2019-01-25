package basepage;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class SearchFriend extends CommonApi {
    @FindBy(name = "q")
    WebElement SearchFriend;
    @FindBy(css = "body._131.hasLeftCol._5vb_._2yq._-kb._61s0._605a.m_13pksao2xn.chrome.webkit.win.x1.Locale_en_US:nth-child(2) div._li:nth-child(1) div._21dp div._2t-8._1s4v._2s1x._h2p div._2t-a._26aw._5rmj._50ti._2s1y div._2t-a._50tj div._2t-a._4pmj._2t-d div._2t-e div._4kny._50tm:nth-child(2) div._585- form:nth-child(1) > button._42ft._4jy0._4w98._4jy3._517h._51sy")
    WebElement Button;
    @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
    public static WebElement loginPageTitle;
    @FindBy(id = "email")
    WebElement username;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(xpath = "//input[@id='u_0_2']")
    WebElement loginBtn;

       public SearchFriend() {
        PageFactory.initElements(driver, this);
    }
    public void Search() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        username.sendKeys("miah_monir@yahoo.com");
        password.sendKeys("rahimam12");
        loginBtn.click();
        //PopUpCloseWindowWebElement.click();
        SearchFriend.sendKeys("Barak Obama");
        Button.click();
    }
    public void popUpHandling() throws InterruptedException {
       Thread.sleep(5000);
      }
       public void Btn(){
          Button.click();
        }
    }





