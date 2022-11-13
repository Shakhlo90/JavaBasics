package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemoLoop {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\tukht\\IdeaProjects\\JavaBasics\\Data\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook exel=new XSSFWorkbook(fileInputStream);
        Sheet sheet=exel.getSheet("Sheet1");
        int noRow=sheet.getPhysicalNumberOfRows();
        System.out.println(noRow);
        for(int i=0; i<noRow;i++){
            Row row=sheet.getRow(i);
            int nocell=row.getPhysicalNumberOfCells();
            for (int j=0; j<nocell; j++){
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
        }
