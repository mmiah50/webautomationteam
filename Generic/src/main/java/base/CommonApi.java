package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonApi {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    @Parameters({/*"useCloudEnv","cloudEnvName", */"os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(/*@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,*/
            @Optional("windows") String os, @Optional("10") String os_version, @Optional("firefox") String browserName, @Optional("34")
            String browserVersion, @Optional("www.google.com") String url) throws IOException {
        getLocalDriver(browserName, os);
        wait = new WebDriverWait(driver, 40);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(String browserName, String os) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {

              
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/mac/chromedriver");
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "/Users/salmaalam/IdeaProjects/webautomationteam/Generic/MacDriver/geckodrivertionpractice\\Generic\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "/Users/salmaalam/IdeaProjects/webautomationteam/Generic/MacDriver/geckodriver");
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
    @AfterMethod
    public void tearDown() {
        // driver.close();
        driver.quit();
    }
}



