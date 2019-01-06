package pagebase;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ApplicationPageBase extends CommonApi {

    public void clearField(WebElement webElement) {
        webElement.clear();
    }

    public void clickSubmit(WebElement element){element.click();}

    public void navigateBack() {
        driver.navigate().back();
    }

    public void typeOnWebElement(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    public void typeOnWebElementAndEnter(WebElement webElement, String value) {
        webElement.sendKeys(value, Keys.ENTER);
    }
}
