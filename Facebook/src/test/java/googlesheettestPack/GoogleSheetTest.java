package googlesheettestPack;
import googlesheetapi.GoogleSheetReader;
import basepage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
public class GoogleSheetTest extends SearchFunctionality {
    SearchFunctionality search=null;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchFunctionality.class);

    }
    @Test
    public void testSearchWithEnterfromSheet() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Properties properties=loadProperties();
        String spreadSheetId=properties.getProperty("GOOGLE.spreadsheetId");
        String range=properties.getProperty("GOOGLE.range");
        List<List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range );
        for(List cell:getRecords){
            String messageText=searchWithENTER(cell.get(0).toString());
            String message=cell.get(1).toString();
            navigateBack();
            Assert.assertEquals( message,messageText);
        }
    }
}