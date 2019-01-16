//package basepage;
//
//import base.CommonApi;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import static basepage.LoginPage.NewsFeed;
//
//
//    public class Signup extends CommonApi {
//        //Webelements
//        @FindBy(css = "#u_0_c")
//        WebElement firstname;
//        @FindBy(css = "#email")
//        WebElement useremail;
//        @FindBy(css = "#pass")
//        WebElement password;
//        @FindBy(css = "#u_0_2")
//        WebElement button;
//        @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]/i[1]")
//        WebElement Fblogoimg;
//        @FindBy(linkText = "Español")
//        WebElement espanol;
//        @FindBy(css = "._52lq span")
//        WebElement bannerinespanol;
//        @FindBy(linkText = "Sign Up")
//        WebElement footersignup;
//        @FindBy(css = "._52lq")
//        WebElement createAnewAccountBanner;
//        @FindBy(linkText = "Log In")
//        WebElement footerlogin;
//        @FindBy(css = "._50f6")
//        WebElement logintofacebookbanner;
//        @FindBy(linkText = "Messenger")
//        WebElement footermessenger;
//        @FindBy(css = "._6aun ._6b6b")
//        WebElement messengerbanner;
//        @FindBy(linkText = "Facebook Lite")
//        WebElement footerfblite;
//        @FindBy(css = ".wrapper > .fb-sideload-text:nth-child(2)")
//        WebElement facebooklitebanner;
//        @FindBy(linkText = "Mobile")
//        WebElement footermobile;
//        @FindBy(css = "._6u")
//        WebElement mobilebanner;
//        @FindBy(linkText = "Find Friends")
//        WebElement footerFindFriends;
//        @FindBy(css = "._50f4")
//        WebElement findfriendsbanner;
//        @FindBy(linkText = "People")
//        WebElement footerpeople;
//        @FindBy(css = ".sx_2f49c7")
//        WebElement facebookbanner;
//        @FindBy(linkText = "Profiles")
//        WebElement footerProfiles;
//        @FindBy(linkText = "Pages")
//        WebElement footerpages;
//        @FindBy(linkText = "Page Categories")
//        WebElement footerpagecatagories;
//        @FindBy(css = "._719g")
//        WebElement allcatagoriesbanner;
//        @FindBy(linkText = "Places")
//        WebElement footerPlaces;
//        @FindBy(css = "._24s5 strong")
//        WebElement discoverplacesbanner;
//
//
//        //for initializing when object will be created
//        public Signup() {
//            PageFactory.initElements(driver, this);
//        }
//
//        //Methods
//        public void signup() throws InterruptedException {
//            firstname.sendKeys("Monir", Keys.TAB, "Miah", Keys.TAB, "Email", Keys.TAB, "password",
//                    Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER, Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER, Keys.TAB,
//                    Keys.ARROW_DOWN, Keys.ENTER, Keys.TAB, Keys.TAB, Keys.ARROW_RIGHT, Keys.ENTER);
//            Thread.sleep(1000);
//        }
//
//        public void login() throws InterruptedException {
//            useremail.sendKeys("selenium925@gmail.com");
//            password.sendKeys("(qazxsw)1234", Keys.ENTER);
//            Thread.sleep(1000);
//        }
//
//        public String validateLoginPageTitle() {
//            return driver.getTitle();
//        }
//
//        public boolean validateLogoimg() {
//            return Fblogoimg.isDisplayed();
//        }
//
//        public boolean clickOnEspanol() throws InterruptedException {
//            espanol.click();
//            Thread.sleep(1000);
//            return bannerinespanol.isDisplayed();
//        }
//
//        public boolean clickOnFooterSignup() throws InterruptedException {
//            footersignup.click();
//            Thread.sleep(1000);
//            return createAnewAccountBanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterLogin() throws InterruptedException {
//            footerlogin.click();
//            Thread.sleep(1000);
//            return logintofacebookbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterMessenger() throws InterruptedException {
//            footermessenger.click();
//            Thread.sleep(1000);
//            return messengerbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterFbLite() throws InterruptedException {
//            footerfblite.click();
//            Thread.sleep(1000);
//            return facebooklitebanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterMobile() throws InterruptedException {
//            footermobile.click();
//            Thread.sleep(1000);
//            return mobilebanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterFindfriends() throws InterruptedException {
//            footerFindFriends.click();
//            Thread.sleep(1000);
//            return findfriendsbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterpeople() throws InterruptedException {
//            footerpeople.click();
//            Thread.sleep(1000);
//            return facebookbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterprofiles() throws InterruptedException {
//            footerProfiles.click();
//            Thread.sleep(1000);
//            return facebookbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterpages() throws InterruptedException {
//            footerpages.click();
//            Thread.sleep(1000);
//            return facebookbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterpagecatagories() throws InterruptedException {
//            footerpagecatagories.click();
//            Thread.sleep(1000);
//            return allcatagoriesbanner.isDisplayed();
//        }
//
//        public boolean clickOnFooterplaces() throws InterruptedException {
//            footerPlaces.click();
//            Thread.sleep(1000);
//            return discoverplacesbanner.isDisplayed();
//        }
//
//
//
//
//
//       // Landing pages
//
//        public NewsFeed gotonewsfeedPage() throws InterruptedException {
//            new Signup();
//            return new NewsFeed();}
//        public void gotoplacespage(){
//            footerPlaces.click();
//        }
//        public void gotopagecatagories(){
//            footerpagecatagories.click();
//        }
//        public void gotopages(){
//            footerpages.click();
//        }
//        public void gotoprofiles(){
//            footerProfiles.click();
//        }
//
//    }
//
//
