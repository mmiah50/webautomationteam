package databasetest;

import base.CommonApi;
import basepage.ExcelReaderPage;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class TestExcelReaderPage extends CommonApi {


        ExcelReaderPage excelReaderPage;
        ExtentReports reports;
        @BeforeMethod
        public void setUp() {
            this.excelReaderPage = new ExcelReaderPage();
            reports = ExtentManager.getInstance();

        }
        @Test(priority = 1)
        public void itemsSearchFromExcelData() throws InterruptedException {
            excelReaderPage.searchFromExcel();
        }
    }



