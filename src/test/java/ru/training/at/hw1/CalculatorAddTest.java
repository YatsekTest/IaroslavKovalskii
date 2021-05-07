package ru.training.at.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorAddTest extends BaseTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addData")
    public void sumTest(long firstNum, long secondNum, long expectedResult) {
        long actual = calculator.sum(firstNum, secondNum);
        assertEquals(actual, expectedResult);
    }

    @Test(enabled = false, dataProviderClass = DataProviders.class, dataProvider = "addData")
    public void sumTest(double firstNum, double secondNum, double expectedResult) {
        double actual = calculator.sum(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }

}
