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
    public static final String SERVICE_DIFFERENT_PAGE_TITLE = "Different Elements";
    public static final String LOGGED_USER_NAME = "ROMAN IOVLEV";
    public static final int HEADER_ITEMS_COUNT = 4;
    public static final int BENEFIT_ITEMS_COUNT = 4;
    public static final int LEFT_SECTION_ELEMENTS_COUNT = 5;
    public static final List<String> HEADER_ITEMS_TITLES =
            new ArrayList<>(Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"));
    public static final List<String> TEXT_ITEMS_TITLES
            = new ArrayList<>(Arrays.asList("To include good practices\n"
                    + "and ideas from successful\n"
                    + "EPAM project",
            "To be flexible and\n"
                    + "customizable",
            "To be multiplatform",
            "Already have good base\n"
                    + "(about 20 internal and\n"
                    + "some external projects),\n"
                    + "wish to get more…"));
    public static final List<String> LEFT_SECTION_TITLES =
            new ArrayList<>(Arrays.asList("Home", "Contact form", "Service",
                    "Metals & Colors", "Elements packs"));
    public static final String[] LOG_TEXTS = {"Colors: value changed to Yellow",
        "metal: value changed to Selen",
        "Wind: condition changed to true",
        "Water: condition changed to true"};

}
