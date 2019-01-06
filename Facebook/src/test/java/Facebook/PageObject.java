package Facebook;

import home.Base;
import org.openqa.selenium.By;

public class PageObject extends Base {

    public By loginEmail = By.xpath("//*[@id=\'email\']");

    public By SignInPwd = By.xpath("//*[@id=\'pass\']");
    public By radio = By.xpath("//*[@id=\'loginbutton\']");
    public By Navigation = By.xpath("//*[@id=\'userNavigationLabel\']");
    public By Settings = By.xpath("//*[@id=\'js_1i\']/div/div/ul/li[20]/a/span/span");
    public By Logout = By.xpath("//*[@id=\'js_kw\']/div/div/ul/li[14]");
    public void Email(String name) {
        enterData(loginEmail, name);
    }
    public void pwd(String name) {
        enterData(SignInPwd, name);
    }
    public void play() {
        clickOn(radio);
    }
    public void Nav() {
        clickOn(Navigation);
    }
    public void lout() {
        clickOn(Logout);
    }
    public void sett(){clickOn(Settings); }

}
