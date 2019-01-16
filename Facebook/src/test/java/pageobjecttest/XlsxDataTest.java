package pageobjecttest;

import basepage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XlsxDataTest {
    public class LoginPageTest extends XlsxDataTest {
        LoginPage loginPage;
    }
    @FindBy(linkText = "Find Friends")
    public static WebElement Search;

}