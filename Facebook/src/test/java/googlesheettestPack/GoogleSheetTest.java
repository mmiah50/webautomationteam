package googlesheettestPack;
import googlesheet.GoogleSheet;
import org.testng.annotations.Test;
import java.io.IOException;
public class GoogleSheetTest extends GoogleSheet {
        @Test
        public void test()throws IOException, InterruptedException{
            logIn();
            searchItemsByName("1Brn0_R-anI625M-vMJIsbxraGNw42uiy43NncQgXXUo","Sheet1!A1:A");
        }
    }


