package basepage;

import base.CommonApi;
import dataReader.XlsxData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFriend extends XlsxData {
    @FindBy(id = "u_e_2")
    WebElement SearchFriend;
    @FindBy(id = "js_o")
    WebElement Button;

    public SearchFriend(String xlfilepath) {
        super(xlfilepath);
    }

    public void Search() {
        SearchFriend.sendKeys("Barak Obama");

    }

    public void btn() {
        Button.click();
    }

}
