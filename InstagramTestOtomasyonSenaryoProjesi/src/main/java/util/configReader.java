package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    private static Properties properties;

    public static Properties initializeProperties(){

        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ACER\\IdeaProjects\\InstagramTestOtomasyonSenaryoProjesi\\src\\main\\resources\\config.properties");
            try {
                properties.load(fileInputStream);
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return getProperties();

    }

    public static Properties getProperties(){
        return properties;
    }

}
