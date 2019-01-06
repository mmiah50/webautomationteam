package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
        protected static WebDriver driver = null;
        protected String url="https://www.facebook.com/";
        public static WebDriver getDriver() {
            return driver;
        }
        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("http://www.facebook.com");
        }
        @AfterMethod
        public void cleanUp() {
            driver.close();
        }
    }


