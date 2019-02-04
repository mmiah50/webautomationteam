package basepage;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageCatagoriesPage extends CommonApi {
    public PageCatagoriesPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Español")
    WebElement espanol;
    @FindBy(css = "._52lq span")
    WebElement bannerinespanol;
    @FindBy(linkText = "Sign Up")
    WebElement footersignup;
    @FindBy(css = "._52lq")
    WebElement createAnewAccountBanner;
    @FindBy(linkText = "Log In")
    WebElement footerlogin;
    @FindBy(css = "._50f6")
    WebElement logintofacebookbanner;
    @FindBy(linkText = "Messenger")
    WebElement footermessenger;
    @FindBy(css = "._6aun ._6b6b")
    WebElement messengerbanner;
    @FindBy(linkText = "Facebook Lite")
    WebElement footerfblite;
    @FindBy(css = ".wrapper > .fb-sideload-text:nth-child(2)")
    WebElement facebooklitebanner;
    @FindBy(linkText = "Mobile")
    WebElement footermobile;
    @FindBy(css ="._6u" )
    WebElement mobilebanner;
    @FindBy(linkText = "Find Friends")
    WebElement footerFindFriends;
    @FindBy(css ="._50f4" )
    WebElement findfriendsbanner;
    @FindBy(linkText = "People")
    WebElement footerpeople;
    @FindBy(css = ".sx_257665")
    WebElement facebookbanner;
    @FindBy(linkText ="Profiles" )
    WebElement footerProfiles;
    @FindBy(linkText = "Pages")
    WebElement footerpages;
    @FindBy(linkText = "Page Categories")
    WebElement footerpagecatagories;
    @FindBy(css = "._719g")
    WebElement allcatagoriesbanner;
    @FindBy(linkText = "Places")
    WebElement footerPlaces;
    @FindBy(css = "._24s5 strong")
    WebElement discoverplacesbanner;
    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
    public boolean clickOnEspanol(){
        espanol.click();
        return bannerinespanol.isDisplayed();}
    public boolean clickOnSignup(){
        footersignup.click();
        return createAnewAccountBanner.isDisplayed();
    }
    public boolean clickOnLogin(){
        footerlogin.click();
        return logintofacebookbanner.isDisplayed();
    }
    public boolean clickOnMessenger(){
        footermessenger.click();
        return messengerbanner.isDisplayed();
    }
    public boolean clickOnFbLite(){
        footerfblite.click();
        return facebooklitebanner.isDisplayed();
    }
    public boolean clickOnMobile(){
        footermobile.click();
        return mobilebanner.isDisplayed();
    }
    public boolean clickOnFindfriends(){
        footerFindFriends.click();
        return findfriendsbanner.isDisplayed();
    }
    public boolean clickOnpeople(){
        footerpeople.click();
        return facebookbanner.isDisplayed();
    }
    public boolean clickOnprofiles(){
        footerProfiles.click();
        return facebookbanner.isDisplayed();
    }
    public boolean clickOnpages(){
        footerpages.click();
        return facebookbanner.isDisplayed();
    }
    public boolean clickOnpagecatagories(){
        footerpagecatagories.click();
        return allcatagoriesbanner.isDisplayed();
    }
    public boolean clickOnplaces(){
        footerPlaces.click();
        return discoverplacesbanner.isDisplayed();
    }
}




