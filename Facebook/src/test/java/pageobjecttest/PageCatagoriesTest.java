package pageobjecttest;
import basepage.PageCatagoriesPage;
import basepage.Signup;
import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PageCatagoriesTest extends CommonApi {
    Signup Singnupob;
    PageCatagoriesPage pageCatagoriesPage;
    @BeforeMethod
    public void initialSetup(){
        Singnupob = new Signup();
        pageCatagoriesPage = new PageCatagoriesPage();
    }
    @Test(priority = 32)
    public void validatePageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actual= pageCatagoriesPage.validatePageTitle();
        Assert.assertEquals(actual,"Facebook - Log In or Sign Up");
    }
    @Test
    public void clickOnEspanolTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnEspanol(),true);
    }
    @Test
    public void clickonFootersignup(){
        Assert.assertEquals(pageCatagoriesPage.clickOnSignup(),true);
    }
    @Test
    public void clickonFooterlogin(){
        Assert.assertEquals(pageCatagoriesPage.clickOnLogin(),true);
    }
    @Test
    public void clickonMesssengerTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnMessenger(),true);
    }
    @Test
    public void clickonFbLiteTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnFbLite(),true);
    }
    @Test
    public void clickonMobileTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnMobile(),true);
    }
    @Test
    public void clickonFindFriendsTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnFindfriends(),true);
    }
    @Test
    public void clickonPeopleTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnpeople(),true);
    }
    @Test
    public void clickonProfileTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnprofiles(),true);
    }
    @Test
    public void clickonPagesTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnpages(),true);
    }
    @Test
    public void clickonPageCatagoriesTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnpagecatagories(),true);
    }
    @Test
    public void clickonPlacesTest(){
        Assert.assertEquals(pageCatagoriesPage.clickOnplaces(),true);
    }
}




