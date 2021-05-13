package ru.training.at.hw3.testdata;

import ru.training.at.hw3.services.DataPropertiesFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class TestData {

    public static final String USERNAME = DataPropertiesFile.getUserData().getProperty("username");
    public static final String PASSWORD = DataPropertiesFile.getUserData().getProperty("password");
    public static final String URL = "https://jdi-testing.github.io/jdi-light/index.html";
    public static final String HOME_PAGE_TITLE = "Home Page";
    public static final String LOGGED_USER_NAME = "ROMAN IOVLEV";

    public static final List<String> HEADER_ITEMS_TITLES = new ArrayList<>(Arrays.asList("HOME", "CONTACT FORM",
            "SERVICE", "METALS & COLORS"));


}
