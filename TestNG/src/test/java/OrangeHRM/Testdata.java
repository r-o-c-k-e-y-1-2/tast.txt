package OrangeHRM;

import org.testng.annotations.DataProvider;
import utillsClasses.ReadExcelFile;

import java.io.IOException;

public class Testdata {

        @DataProvider
        public Object[][] validlogindata(){

            Object obj [][] = {{"Admin","admin123"}};
            return obj;
        }
    @DataProvider
    public String[][] validData() throws IOException {

        String[][] excelData = ReadExcelFile.getexceldata();
        return excelData;


    }




}

