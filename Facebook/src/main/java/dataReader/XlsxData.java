package dataReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class XlsxData {
    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public XlsxData(String xlfilepath){
        try{
            File src = new File("C:\\Users\\Moniruzzaman Miah\\Desktop\\java1\\webautomationteam\\Facebook\\src\\main\\java\\testData\\FBtestData.xlsx");
            FileInputStream fis =new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
            sheet1 = wb.getSheetAt(0);
            wb.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void ChecksearchFriend() {
    }

    public String getData(int sheetnumber,int rownumber,int colnumber)
    { sheet1 = wb.getSheetAt(sheetnumber);
        String data = sheet1.getRow(rownumber).getCell(colnumber).getStringCellValue();
        return data;
    }
    public int getRowCount(int sheetNumber){
        int row=  wb.getSheetAt(sheetNumber).getLastRowNum();
        row = row +1;
        return row;
    }
}


