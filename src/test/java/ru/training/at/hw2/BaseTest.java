package ru.training.at.hw2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    private static final String URL = "https://jdi-testing.github.io/jdi-light/index.html";
    protected static final String LOGIN = "Roman";
    protected static final String PASSWORD = "Jdi1234";

    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void driverTearDown() {
        if (driver != null) driver.quit();
    }
}
