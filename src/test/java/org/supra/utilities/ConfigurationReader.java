package org.supra.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try{
            FileInputStream fis = new FileInputStream("configuration.properties");
            properties.load(fis);
            fis.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error occurred while reading configuration file");
        }
    }

    public static String getProperty(String key){
       return properties.getProperty(key);
    }
}
