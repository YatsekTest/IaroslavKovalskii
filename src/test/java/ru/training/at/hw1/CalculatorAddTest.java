package ru.training.at.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorAddTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addData", groups = {"addSubtract"})
    public void sumTest(long firstNum, long secondNum, long expectedResult) {
        Calculator calculator = new Calculator();
        long actual = calculator.sum(firstNum, secondNum);
        assertEquals(actual, expectedResult);
    }

/*
    @Test(dataProviderClass = DataProviders.class, dataProvider = "addData", groups = {"addSubtract1"})
    public void sumTest(double firstNum, double secondNum, double expectedResult) {
        Calculator calculator = new Calculator();
        double actual = calculator.sum(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }
*/



}
