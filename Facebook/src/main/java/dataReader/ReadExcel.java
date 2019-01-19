package dataReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {
    public static void main(String[]args) throws Exception{
        File src = new File("C:\\Users\\Moniruzzaman Miah\\Desktop\\java1\\webautomationteam\\Facebook\\src\\main\\java\\testData\\FBtestData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data From Excel is: "+data0);
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data From Excel is: "+data1);
        int rowcount = sheet1.getLastRowNum();
        //System.out.println("Total Row is: "+rowcount+1);
//        for (int i=0; i<rowcount; i++){
//            String data0 = sheet1.getRow(i).getCell(1).getStringCellValue();
//            System.out.println("Excel Test Data form ROW : " + i +   data0);
//        }
//
//        wb.close();


    }

}
