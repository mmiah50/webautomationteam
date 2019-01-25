package googlesheet;

import base.CommonApi;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googlesheetapi.GoogleSheetReader.getSheetsService;
import static java.lang.Thread.sleep;


public class GoogleSheet extends CommonApi {

        public void logIn(){
            driver.findElement(By.xpath("//*[@name='email']")).sendKeys("miah_monir@yahoo.com");
            driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("rahimam12");
            driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
        }

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

        public List<String> searchItemsByName(String spreadSheetID, String range) throws IOException, InterruptedException {
            List<List<Object>> values = getSpreadSheetRecords(spreadSheetID,range);
            List<String> actual = new ArrayList<String >();
            for(List row : values){
                sleep(2);
                typeemail("//*[@name='q']",row.get(0).toString());
                sleep(2);
                actual.add(getCurrentPageUrl());
                clearInputByXpath("//*[@name='q']");
                sleep(2);
            }return actual;
        }
    }
