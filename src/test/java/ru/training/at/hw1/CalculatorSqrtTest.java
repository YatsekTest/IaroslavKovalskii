package ru.training.at.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSqrtTest extends BaseTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "sqrtData")
    public void sqrtTest(double num, double expectedResult) {
        double actual = calculator.sqrt(num);
        assertEquals(actual, expectedResult, 0.01);
    }
}
