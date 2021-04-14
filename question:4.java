import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  

import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  

public class Main {
public static void main(String[] args)
    {
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\Debdeep.pc\\Downloads\\BCT comp\\radiance training\\29th march\\ExcelRead"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            XSSFSheet output = workbook.createSheet("Output");
            int i=0;
            Row r = output.createRow(i++);
            Cell nameCell = r.createCell(0);
            nameCell.setCellValue("Student Name");
            Cell marksCell = r.createCell(1);
            marksCell.setCellValue("Student Marks");
            Cell percentCell = r.createCell(2);
            percentCell.setCellValue("Percentage");
            
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next(); 
                String studentName = row.getCell(0).getStringCellValue();
                double marks = row.getCell(1).getNumericCellValue();
                double percentage = (marks/1000)*100;

                if(percentage >= 35) {
                    Row r1 = output.createRow(i++);
                    Cell nCell = r1.createCell(0);
                    nCell.setCellValue(studentName);
                    Cell mCell = r1.createCell(1);
                    mCell.setCellValue(marks);
                    Cell pCell = r1.createCell(2);
                    pCell.setCellValue(percentage);
                }
            }
            file.close();

            FileOutputStream os = new FileOutputStream("ExcelWrite.xlsx");
            workbook.write(os);
            workbook.close();
            os.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
