package Facebook;

import home.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static home.CommonAPI.getDriver;

public class Login extends CommonAPI {
    @Test
    public void login() throws InterruptedException{
        getDriver();
        PageObject SignintoFB = PageFactory.initElements(driver, PageObject.class);
        SignintoFB.Email("miah_monir@yahoo.com");
        SignintoFB.pwd("kjhsgsjb37874");
        SignintoFB.play();
        SignintoFB.Nav();
        SignintoFB.sett();
        // Thread.sleep(3000);
        // SignintoFB.Nav();
        // SignintoFB.lout();
    }
}
