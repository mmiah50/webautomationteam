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
public class SearchFunctionality extends LoginPage {
    @FindBy(css = "#u_h_2 > input._1frb")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"u_h_2\"]/input[2]")
    public static WebElement searchMessage;
    private Object name;
    private String getMessage;

    private String searchWithENTER(String key) {
        return getMessage;
    }
    private void navigateBack() {
        navigateBack();
    }

    public void waitToBeVisible() {
        searchMessage.click();
        wait.until(ExpectedConditions.visibilityOf(searchMessage));
    }
    public String searchWithEnter(String searchKeys) {
        TestLogger.log(getClass().getSimpleName() + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        // waitToBeVisible();
        searchBox.sendKeys(searchKeys, Keys.ENTER);
        return searchMessage.getText();

    }
    public String searchOptionTab() {
        TestLogger.log(getClass().getSimpleName() + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        return searchMessage.getText();

    }
    private String convertToString(String name) {
        return name;
    }


    List<String> keyList = new ArrayList<String>();
    List<String> messageList = new ArrayList<>();

    public List<String> getSearchKeys() {
        keyList.add("Barak Obama");
        keyList.add("Jimmy Carter");
        keyList.add("George Bush");
        keyList.add("Theodore Roosevelt");
        return keyList;
    }
    public List<String> searchfromdatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con = new ConnectToSqlDB();
        getSearchKeys();
        con.insertDataFromArrayListToSqlTable(keyList, "SearchItem", "SearchKeys");
        List<String> data = con.readDataBase("SearchItem", "SearchKeys");
        for (String key : data) {
            String messageText = searchWithENTER(key);
            messageList.add(messageText);
            navigateBack();
        }
        return messageList;
    }
}