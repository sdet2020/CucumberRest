package com.spartan.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        }catch (IOException e ){
            System.out.println("ERROR LOADING FILE "+e.getMessage());
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
