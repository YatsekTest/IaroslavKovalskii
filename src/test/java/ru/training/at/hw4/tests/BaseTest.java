package ru.training.at.hw4.tests;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.training.at.hw4.services.DriverManager;

import java.util.concurrent.TimeUnit;

@Story(value = "Jdi pages testing.")
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.setUpDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
