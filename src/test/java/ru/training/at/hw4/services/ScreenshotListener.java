package ru.training.at.hw4.services;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = DriverManager.driver;
        attachScreenshot(driver);
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = ".png")
    private byte[] attachScreenshot(WebDriver driver) {
        return ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.BYTES);
    }

}
