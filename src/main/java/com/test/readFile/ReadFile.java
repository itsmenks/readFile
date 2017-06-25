package com.test.readFile;
/**
 * Hello world!
 *

public class ReadFile
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/

import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadFile {

    public String excelPath;

    public String getPath() {
        final String excelPath = "//var//tmp//data.xls";
        return excelPath;
    }

    public ReadFile() {
        excelPath = getPath();

    }

    public int ShowFile(final String path) {
        try {

            final FileInputStream fileInputStream = new FileInputStream(new File(path));

            // Create Workbook instance holding .xls file
            final HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            // Get the first work sheet
            final HSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each rows
            final Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                // Get Each Row
                final Row row = rowIterator.next();
                // Get Each Cell
                final Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    final Cell cell = cellIterator.next();
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println("");

            }
            return 0;
            
        } catch (final IOException ie) {
            System.out.println(ie.toString()+"invalid file name");
            return 1;
        }

    }

    public static void main(final String[] args) {

        final ReadFile readFile = new ReadFile();
        readFile.ShowFile(readFile.getPath());

    }

}