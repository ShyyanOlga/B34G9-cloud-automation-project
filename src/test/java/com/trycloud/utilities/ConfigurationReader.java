package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //Creat Property object -> privet limiting access -> static, so it is going to load before everything
    private static Properties properties = new Properties();


    static {
        try {
            //Open file -> FileInputStream -> path your "path" in constructor
            FileInputStream file = new FileInputStream("configuration.properties");

            //Load the properties object with (file)
            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("File not found with given path!!!");
            e.printStackTrace();

        }
    }
    public static String getProperties(String keyword){

        return properties.getProperty(keyword);
    }
}
