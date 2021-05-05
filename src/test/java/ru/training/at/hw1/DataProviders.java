package ru.training.at.hw1;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] addData() {
        return new Object[][]{{5, 5, 10}, {2, 2, 4}, {100, 100, 200}};
    }

    @DataProvider
    public static Object[][] subtractData() {
        return new Object[][]{{10, 5, 5}, {4, 2, 2}, {100, 100, 0}};
    }

    @DataProvider
    public static Object[][] multiplyData() {
        return new Object[][]{{5.0, 5.0, 25.0}, {2, 2, 4}, {100, 10, 1000}};
    }

    @DataProvider
    public static Object[][] divideData() {
        return new Object[][]{{25.0, 5.0, 5.0}, {4.0, 2.0, 2.0}, {100.0, 3.0, 33.33}};
    }

    @DataProvider
    public static Object[][] sqrtData() {
        return new Object[][]{{25.0, 5.0}, {4.0, 2.0}, {100.0, 10.0}};
    }

}
