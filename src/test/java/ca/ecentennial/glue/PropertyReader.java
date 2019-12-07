package ca.ecentennial.glue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String getValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/cucumber.properties");
        prop.load(file);

        return prop.getProperty(key);
    }
}
