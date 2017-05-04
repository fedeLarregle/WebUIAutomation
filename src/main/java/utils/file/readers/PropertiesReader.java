package utils.file.readers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author federico on 03/05/17.
 * @email fede.larregle@gmail.com
 */
public class PropertiesReader {

    private static final PropertiesReader instance;
    private static final String PROPERTIES_PATH;
    private final InputStream propertiesResource;
    private final Properties properties;

    static {
        instance = new PropertiesReader();
        PROPERTIES_PATH = "";
    }

    private PropertiesReader() {
        propertiesResource = PropertiesReader.class.getClassLoader().getResourceAsStream(PROPERTIES_PATH);
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        if ( propertiesResource != null ) {
            try {
                properties.load(propertiesResource);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if ( propertiesResource != null) {
                        propertiesResource.close();
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public static PropertiesReader getInstance() {
        return instance;
    }

    public String getPropertiesValue(String key) {
        return properties.getProperty(key);
    }

}
