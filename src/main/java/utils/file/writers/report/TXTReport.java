package utils.file.writers.report;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author federico on 07/05/17.
 * @email fede.larregle@gmail.com
 */
public class TXTReport implements Report {

    private static final String FILE_PATH;

    private final Map<String, String> information;
    private final int failTests;
    private final int passTests;
    private final int testCaseNo;

    static {
        FILE_PATH = TXTReport.class.getClassLoader().getResource("PATH").getFile();
    }

    /**
     * Every 'Test' should have an information 'HashMap' from where
     * we are going to take the information and put it in the report
     * @param information
     */
    public TXTReport(HashMap<String, String> information) {
        this.information = information;
        this.failTests = Integer.decode(information.get("fail"));
        this.passTests = Integer.decode(information.get("pass"));
        this.testCaseNo = Integer.decode(information.get("testNo"));

    }

    @Override
    public void createReport() {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH)) ) {

        } catch (IOException ioe) { ioe.printStackTrace(); }
    }

    @Override
    public String readReport() {
        return null;
    }
}
