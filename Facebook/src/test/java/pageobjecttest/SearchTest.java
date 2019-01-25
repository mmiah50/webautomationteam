package pageobjecttest;
import basepage.SearchFriend;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SearchTest<prefs> extends SearchFriend {

    SearchFriend SF;

    @BeforeMethod
    public void initElements() throws Exception {
        SF = PageFactory.initElements(driver, SearchFriend.class);
        Thread.sleep(5000);
    }

    @Test
    public void test() {
        SF.Search();
        SF.Btn();
    }
}








