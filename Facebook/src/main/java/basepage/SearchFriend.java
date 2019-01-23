package basepage;

import base.CommonApi;
import com.google.api.services.sheets.v4.Sheets;
import dataReader.XlsxData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFriend extends CommonApi  {
    @FindBy(className = "_1frb")
    WebElement SearchFriend;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")
    WebElement Button;
    @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
    public static WebElement loginPageTitle;
    @FindBy(id = "email")
    WebElement username;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(xpath = "//input[@id='u_0_2']")
     WebElement loginBtn;
   // @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")
    //WebElement searchButton;
    //@FindBy ()

    /*public SearchFriend(String xlfilepath) {
        super(xlfilepath);
    }*/
    public SearchFriend(){
        PageFactory.initElements(driver, this);
    }
    public void Search() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        username.sendKeys("miah_monir@yahoo.com");
        password.sendKeys("salmam12");
        loginBtn.click();
       // PopUpCloseWindowWebElement.click();
        SearchFriend.sendKeys("Barak Obama");
        Button.click();
    }

    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\nafas\\Desktop\\sohag\\Group-13\\Costco\\src\\main\\java\\ExcellData\\ExcelData.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        SearchFriend.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            SearchFriend.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            SearchFriend.clear();


        }
    }

    public void popUpHandling()throws InterruptedException{
      /*  String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        subWindowHandler = iterator.next();
        driver.switchTo().window(subWindowHandler);*/
        //Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(officeDepotPopUpCloseWindowWebElement));
        //PopUpCloseWindowWebElement.click();
        // driver.switchTo().window(parentWindowHandler);
    }

    public void btn() {
        Button.click();
    }

}
