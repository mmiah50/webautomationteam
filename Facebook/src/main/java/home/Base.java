package home;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Base {
    public static WebElement webDriverFluentWait(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(CommonAPI.getDriver()).withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class).withMessage(
                        "Webdriver waited for 20 seconds");
        WebElement element = wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }
    public void enterData(By locator, String keysToSend) {
        webDriverFluentWait(locator).sendKeys(keysToSend);
    }
    public void clickOn(By locator) {
        webDriverFluentWait(locator).click();
    }
    public void verifyText(By locator, String expected) {
        String actual = webDriverFluentWait(locator).getText();
        System.out.println(actual);
    }
}
