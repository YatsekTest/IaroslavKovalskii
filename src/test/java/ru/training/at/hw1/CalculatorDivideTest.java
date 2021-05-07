package ru.training.at.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorDivideTest extends BaseTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divideData")
    public void divideTest(double firstNum, double secondNum, double expectedResult) {
        double actual = calculator.div(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }

}
