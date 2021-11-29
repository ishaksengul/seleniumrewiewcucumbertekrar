package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties;
    static {
        String fileYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (Exception e){

        }
    }

    public static  String getProperty(String key){
        String value = properties.getProperty(key);
        return value;
    }
}
