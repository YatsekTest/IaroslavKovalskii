package ru.training.at.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultiplyTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multiplyData", groups = {"addSubtract"})
    public void multiplyTest(double firstNum, double secondNum, double expectedResult) {
        Calculator calculator = new Calculator();
        double actual = calculator.mult(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }

}
