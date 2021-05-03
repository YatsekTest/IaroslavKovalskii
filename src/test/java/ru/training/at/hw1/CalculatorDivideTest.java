package ru.training.at.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorDivideTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divideData", groups = {"addSubtract"})
    public void divideTest(double firstNum, double secondNum, double expectedResult) {
        Calculator calculator = new Calculator();
        double actual = calculator.div(firstNum, secondNum);
        assertEquals(actual, expectedResult, 0.01);
    }

}
