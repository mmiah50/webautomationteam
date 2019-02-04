package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonApi {
    public static WebDriver driver = null;
    public static WebDriverWait wait = null;
    public static final String browserstack_username = "moniruzzamanmiah1";
//    public static final String browserstack_automateKey = "JYnDWrFEY55N9ZefEVsj";
//    public static final String saucelabs_username ="" ;
//    public static final String saucelabs_accesskey = "";
//    @Parameters({"useCloudEnv","cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})
//    @BeforeMethod
//    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,
//                      @Optional("windows") String os, @Optional("10") String os_version, @Optional("firefox") String browserName, @Optional("34")
//                              String browserVersion, @Optional("https://www.google.com") String url) throws IOException {
//
//        if (useCloudEnv == true) {
//            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
//                getCloudDriver(cloudEnvName, browserstack_username, browserstack_automateKey, os, os_version, browserName, browserVersion);
//            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
//                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
//            }
//        } else {
//            getLocalDriver(browserName, os);
//        }
//        wait = new WebDriverWait(driver, 40);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
//        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
//        driver.manage().window().maximize();
//        driver.get(url);
//
//    }
//
//    public WebDriver getLocalDriver(String browserName, String os) {
//
//
//        if (browserName.equalsIgnoreCase("chrome")) {
//            ChromeOptions options =new ChromeOptions();
//            options.addArguments("--start-maximized");
//            options.addArguments("--ignore-certificate-errors");
//            options.addArguments("--incognito");
//            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//            if (os.equalsIgnoreCase("windows")) {
//                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/windows/chromedriver.exe");
//                driver = new ChromeDriver(options);
//                 // TestLogger.log("Chrome Browser Launched");
//            } else if (os.equalsIgnoreCase("mac")) {
//                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/mac/chromedriver");
//                driver = new ChromeDriver(options);
//                // TestLogger.log("Chrome Browser Launched");
//            }
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//
//            FirefoxOptions options = new FirefoxOptions();
//
//            options.addArguments("--start-maximized");
//            options.addArguments("--ignore-certificate-errors");
//            options.addArguments("--private");
//            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//
//
//            if (os.equalsIgnoreCase("windows")) {
//                System.setProperty("webdriver.gecko.driver", "../Generic/drivers/windows/geckodriver.exe");
//                driver = new FirefoxDriver(options);
//            } else if (os.equalsIgnoreCase("mac")) {
//                System.setProperty("webdriver.gecko.driver", "../Generic/drivers/mac/geckodriver");
//                driver = new FirefoxDriver(options);
//            }
//        }
//
//       return driver;
//    }
//
//    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
//                                    String browserVersion) throws IOException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", browserName);
//        caps.setCapability("browser_version", browserVersion);
//        caps.setCapability("os", os);
//        caps.setCapability("os_version", os_version);
//
//        // WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//
//        if (envName.equalsIgnoreCase("Saucelabs")) {
//            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), caps);
//
//        } else if (envName.equalsIgnoreCase("Browserstack")) {
//
//            caps.setCapability("resolution", "1024x768");
//            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
//        }
//        return driver;
//    }
//

    @Parameters({/*"useCloudEnv","cloudEnvName", */"os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(/*@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,*/
            @Optional("windows") String os, @Optional("10") String os_version, @Optional("chrome") String browserName, @Optional("34")
            String browserVersion, @Optional("https://www.facebook.com") String url) throws IOException {
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
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Drivers/chromedriver");
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "..\\Generic\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Drivers/geckodriver");
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

    //ExtentReport
    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }

    }

    public static void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);

    }
    public static void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }
    public void clearInputField(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
}
