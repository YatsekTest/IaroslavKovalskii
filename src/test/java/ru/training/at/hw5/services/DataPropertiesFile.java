package ru.training.at.hw5.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataPropertiesFile {

    private static Properties userData;
    private static final String DATA_FILE_PATH = "src/test/resources/userData.properties";

    public static Properties getUserData() {
        try (InputStream inputStream = new FileInputStream(DATA_FILE_PATH)) {
            userData = new Properties();
            userData.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userData;
    }

}
