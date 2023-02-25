package interview.coding;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/java/test.properties");
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("name"));

    }
}
