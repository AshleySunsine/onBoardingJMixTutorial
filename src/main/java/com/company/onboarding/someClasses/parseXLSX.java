package com.company.onboarding.someClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class parseXLSX {
  /*  public void start() {
        getContacts("./data/okei.xlsx");
    }

    public static void getContacts(String path) {
        try (InputStream inputStream = new FileInputStream(new File(path))) {
            XSSFWorkbook myWorkBook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = myWorkBook.getSheetAt(0);
            HSSFDataFormatter hdf = new HSSFDataFormatter();
            Iterator<Row> rows = sheet.rowIterator(); // Перебираем все строки

            // Перебираем все строки начиная со второй до тех пор, пока документ не закончится
            int rowNum = 3;
            while ((rowNum < 600) && (rows.hasNext())) {
                String result2 = "--->   ";
                Row row = rows.next();
                Iterator<Cell> cells = row.iterator();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    result2 += hdf.formatCellValue(cell) + "; ";
                }
                System.out.println(rowNum + ") " + result2);
                rowNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    */
}

/*
  <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.12</version>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>3.12</version>
        </dependency>
 */