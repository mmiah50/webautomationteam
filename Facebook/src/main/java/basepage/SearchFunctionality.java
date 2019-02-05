package basepage;
import database.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import basepage.ApplicationBasePage;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;
public class SearchFunctionality extends ApplicationBasePage {
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/input")
    public static WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/button")
    public static WebElement searchSubmitButton;
    @FindBy(xpath = "//a[@class='search']")
    public static WebElement searchIcon;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/h1[1]")
    public static WebElement searchResultHeadline;
    public   void waitToBeVisible(){
        searchIcon.click();
        wait.until(ExpectedConditions.visibilityOf(searchTextBox));
    }
    public String searchWithENTER(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        clearField(searchTextBox);
        searchTextBox.sendKeys(searchKeys, Keys.ENTER);
        return searchResultHeadline.getText();
    }
    public String searchUsingButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        clearField(searchTextBox);
        searchTextBox.sendKeys(searchKeys);
        searchSubmitButton.click();
        return searchResultHeadline.getText();
    }
    List<String> keyList = new ArrayList<String>();
    List<String> messageList=new ArrayList<>();
    public List<String> getSearchKeys(){
        keyList.add("Bill Clinton");
        keyList.add("Jimmy Carter");
        keyList.add("George Bush");
        //keyList.add("condo");
        return keyList;
    }
    public List<String> searchfromdatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con=new ConnectToSqlDB();
        getSearchKeys();
        con.insertDataFromArrayListToSqlTable(keyList,"SearchItem","SearchKeys");
        List<String> data = con.readDataBase("SearchItem","SearchKeys");
        for (String key:data){ String messageText=searchWithENTER(key);
            messageList.add(messageText);
            navigateBack();
        }
        return messageList;
    }
}