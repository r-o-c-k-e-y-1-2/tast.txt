package utillsClasses;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {

    public  static String[][]getexceldata() throws IOException {

        String path = "src/test/resources/configuration/ReadFile.xlsx";

        FileInputStream file = new FileInputStream(path);

        XSSFWorkbook Workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = Workbook.getSheetAt(0);

        int lastrowNum = sheet.getLastRowNum(); //exclude the header tells how many rows

        //	int getPhysicalnumberofRows = sheet.getPhysicalNumberOfRows(); // tells how many headers row

        System.out.println("Number of rows is : "+lastrowNum);
        //	System.out.println("Incusive row of header : "+ getPhysicalnumberofRows);

        short getlastCellNum = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[lastrowNum][getlastCellNum];

        for(int i=1;i<=lastrowNum;i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < getlastCellNum; j++) {
                XSSFCell cell = row.getCell(j);

                DataFormatter dataformatter = new DataFormatter();
                String value = dataformatter.formatCellValue(cell);
                data[i-1][j] = value;


            }

        }
        Workbook.close();
        return data;

    }
}
