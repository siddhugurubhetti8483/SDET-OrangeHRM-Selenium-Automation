package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;

    public ConfigReader(){  
        try{
            prop = new Properties();
            FileInputStream file = new FileInputStream("src/test/java/tests/resources/config.properties");
            prop.load(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String key){
        return prop.getProperty(key);
    }
}

