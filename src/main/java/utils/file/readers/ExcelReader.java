package utils.file.readers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Singleton class for excel files reading
 * @author federico on 04/05/17.
 * @email fede.larregle@gmail.com
 */
public class ExcelReader {

    private static final ExcelReader instance;
    private static final String EXCEL_FILE_NAME;
    private static final String RESOURCE;
    private FileInputStream inputStream;
    private final Workbook workbook;

    static {
        instance = new ExcelReader();
        EXCEL_FILE_NAME = "EXCEL_FILE_NAME";
        RESOURCE = ExcelReader.class.getClassLoader().getResource("EXCEL_FILE_NAME").getFile();
    }

    private ExcelReader() {
        workbook = loadStream();
    }

    private Workbook loadStream() {
        Workbook workbook = null;

        try {
            inputStream = new FileInputStream(new File(RESOURCE));
            if (inputStream != null) {
                workbook = new XSSFWorkbook(inputStream);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return workbook;
    }

    public static ExcelReader getInstace() { return instance; }

    public <O extends Object> List<O> getRow() {

        return null;
    }

    private Object getCellValue(Cell cell) {
        switch ( cell.getCellType() ) {
            case Cell.CELL_TYPE_STRING: {
                return cell.getStringCellValue();
            }
            case Cell.CELL_TYPE_NUMERIC: {
                return cell.getNumericCellValue();
            }
            case Cell.CELL_TYPE_BOOLEAN: {
                return cell.getBooleanCellValue();
            } default: {
                return null;
            }
        }
    }
}
