package ru.training.at.hw5.testdata;

import ru.training.at.hw5.services.DataPropertiesFile;

public final class TestData {

    public static final String USERNAME = DataPropertiesFile.getUserData().getProperty("username");
    public static final String PASSWORD = DataPropertiesFile.getUserData().getProperty("password");
    public static final String URL = "https://jdi-testing.github.io/jdi-light/index.html";
    public static final String[] LOG_TEXTS = {"Colors: value changed to Yellow",
        "metal: value changed to Selen",
        "Wind: condition changed to true",
        "Water: condition changed to true"};

}
