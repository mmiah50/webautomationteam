//package googlesheettestPack;
//import googlesheetapi.GoogleSheetReader;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.io.IOException;
//import java.util.List;
//import java.util.Properties;
//import static database.ConnectToSqlDB.loadProperties;
//
//
//public class GoogleSheetTest extends SearchFunctionality {
//    SearchFunctionality search=null;
//    @BeforeMethod
//    public void initialisationOfElements(){
//        search = PageFactory.initElements(driver,SearchFunctionality.class);
//    }
//    @Test
//    public void testSearchWithEnterfromSheet() throws IOException {
//
//        Properties properties=loadProperties();
//        String spreadSheetId=properties.getProperty("1Brn0_R-anI625M-vMJIsbxraGNw42uiy43NncQgXXUo");
//        String range=properties.getProperty("Google Sheet!A2:B");
//        java.util.List<List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range );
//        for(List<Object> cell:getRecords){
//            String messageText=searchWithEnter(cell.get(0).toString());
//            String message=cell.get(1).toString();
//            // Assert.assertEquals( message,messageText);
//        }
//    }
//}