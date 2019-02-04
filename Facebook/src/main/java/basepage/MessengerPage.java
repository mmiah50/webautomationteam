package basepage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
public class MessengerPage extends CommonApi {
    public MessengerPage(){
        PageFactory.initElements(driver,this);
    }
    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}

}

