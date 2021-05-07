package ru.training.at.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultiplyTest extends BaseTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multiplyData")
    public void multiplyTest(double firstNum, double secondNum, double expectedResult) {
        double actual = calculator.mult(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }

}
