package dataReader;
import basepage.ExcelReaderPage;
import org.testng.annotations.Test;
import java.io.IOException;
public class TestExcelReaderPage extends ExcelReaderPage {
        @Test
        public void test() throws IOException {
            logIn();
            searchByExcel();
        }
    }
