package googlesheet;

import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import java.io.IOException;
import java.time.temporal.ValueRange;
import java.util.List;
import static googlesheetapi.GoogleSheetReader.getSheetsService;

public class GoogleSheetSignin {

    private By driver;

    public void typeEmailAddress(String locator, String value){
            driver.findElement((SearchContext) By.xpath("email")).sendKeys(value);
        }
        public void typePasswords(String locator,String value){
            driver.findElement((SearchContext) By.id("pass")).sendKeys(value);
        }
        public void clickLogin(String locator){
            driver.findElement((SearchContext) By.xpath("//input[@id='u_0_2']")).click();
        }
        public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
                       Sheets service = getSheetsService();
         /* ValueRange response = service.spreadsheets().values()
                   .get(spreadsheetId, range)
                   .execute();
           List<List<Object>> values = ((com.google.api.services.sheets.v4.model.ValueRange) response).getValues();
          if (values == null || values.size() == 0) {   */
                return null;
              }

        public void enterUserNameAndPassword(String spreadsheetId, String range) throws IOException, InterruptedException {
            List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
            for (List row : values) {
                typeEmailAddress("id_userLoginId",row.get(0).toString());
                typePasswords("id_password",row.get(1).toString());
                clickLogin("//button[.='Login']");
            }
        }
    }

