package ru.training.at.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

}
