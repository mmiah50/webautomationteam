package googlesheettestPack;

import basepage.LoginPage;
import googlesheet.GoogleSheetSignin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class GoogleSheetTest extends GoogleSheetSignin {
    GoogleSheetSignin LoginPage;
    private WebDriver driver;


    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LoginPage = PageFactory.initElements(driver, basepage.LoginPage.class);
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        setUrl("http://www.facebook.com");
        LoginPage.clickSignInGS();
    }

    private String convertToString(String name) throws IOException, InterruptedException {
        convertToString() {
        }

        @Test
        public void loginEmailAndPassword;
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String spreadsheetId = "1h-FtsfIBgUhA8woZUw8DuxY92KQcO_n-vxjPSuugG-s";
        String range = "Sheet1!A2:B2";
        enterUserNameAndPassword(spreadsheetId, range);

    }

}
