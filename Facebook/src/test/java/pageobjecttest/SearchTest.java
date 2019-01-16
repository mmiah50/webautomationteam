package pageobjecttest;

import base.CommonApi;
import basepage.SearchFriend;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends CommonApi {
    SearchFriend SF;
    @BeforeMethod
    public void initElements() {
        SF = PageFactory.initElements(driver, basepage.SearchFriend.class);
    }
        @Test
        public void test(){
         SF.Search();
         SF.btn();

        }
    }



