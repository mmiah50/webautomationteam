package excelreader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class MydataReader3 {
    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public MydataReader3(String xlfilepath){
        try{
            File src = new File(xlfilepath);
            FileInputStream fis =new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
            sheet1 = wb.getSheetAt(0);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
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
