package basepage;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonApi {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id=\"search-field\"]")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\nafas\\Desktop\\sohag\\Group-13\\Costco\\src\\main\\java\\ExcellData\\ExcelData.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchBox.clear();


        }
    }
}