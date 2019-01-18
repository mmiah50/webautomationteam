package pageobjecttest;

import basepage.LoginPage;
import dataReader.XlsxData;
import org.testng.annotations.Test;

public class XlsxDataTest {
    public class LoginPageTest extends XlsxDataTest {
        LoginPage loginPage;
    }


    @Test
    public void SearchTest()
    {
        XlsxData.ChecksearchFriend();
    }
}

