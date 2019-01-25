package basepage;

import base.CommonApi;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReaderPage extends CommonApi {

        public void logIn(){
            typeByXpath("//*[@name='email']", "miah_monir@yahoo.com");
            typeByXpath("//*[@name='pass']", "rahimam12");
            clickByXpath("//*[@id='loginbutton']");
        }

        public void searchByExcel() throws IOException {
            ArrayList<String> data = dataFromExcel(0);
            for(int i=0;i<data.size();i++){
                driver.findElement(By.xpath("//*[@name='q']")).sendKeys(data.get(i));
                clearInputByXpath("//*[@name='q']");
            }
        }
        public ArrayList<String> dataFromExcel(int colNo) throws IOException {
            FileInputStream filein = new FileInputStream("../Facebook/data/file1.xls");
            HSSFWorkbook hss = new HSSFWorkbook(filein);
            HSSFSheet siter = hss.getSheet("Sheet1");
            Iterator<Row> rowIT =siter.iterator();
            ArrayList<String> list = new ArrayList<String>();
            while(rowIT.hasNext()){
                list.add(rowIT.next().getCell(colNo).getStringCellValue());
            }
            return list;
        }
    }
