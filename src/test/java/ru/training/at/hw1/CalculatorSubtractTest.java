package ru.training.at.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSubtractTest extends BaseTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subtractData")
    public void subtractTest(long firstNum, long secondNum, long expectedResult) {
        long actual = calculator.sub(firstNum, secondNum);
        assertEquals(actual, expectedResult);
    }

}
