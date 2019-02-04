package pageobjecttest;
import base.CommonApi;
import basepage.MessengerPage;
import basepage.Signup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MessengerPageTest extends CommonApi {
    MessengerPage messengerPage;
    Signup signup;
    @BeforeMethod
    public void setupProfilepagetest(){
        messengerPage =new MessengerPage();
        signup = new Signup();
   }
    @Test
    public void getTitleTest() throws InterruptedException {
        String actual= messengerPage.validatePageTitle();
        Assert.assertEquals(actual,"Facebook");
    }

}


