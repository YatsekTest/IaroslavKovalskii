package ru.training.at.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSubtractTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subtractData", groups = {"addSubtract"})
    public void subtractTest(long firstNum, long secondNum, long expectedResult) {
        Calculator calculator = new Calculator();
        long actual = calculator.sub(firstNum, secondNum);
        assertEquals(actual, expectedResult);
    }

}
