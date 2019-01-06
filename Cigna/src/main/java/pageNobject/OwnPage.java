package pageNobject;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnPage extends CommonApi {

    @FindBy(id = "login")
    public static WebElement loginButton;
    @FindBy(id = "find-doc")
    public static WebElement findDoctor;
    @FindBy(xpath = ".//*[@id='csng-search-header']/search-header-bar/form/cigna-typeahead/div/input")
    public static WebElement search;
    @FindBy(xpath = ".//*[@id='1386067114266']/div[4]/div/div[2]/nav/ul/li[1]/a")
    public static WebElement indFamPlan;

}



