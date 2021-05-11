package ru.training.at.hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.training.at.hw2.BaseTest;

import java.util.List;

public class ExerciseOneTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    // Assert Browser title
    @Test(priority = 2)
    public void browserTitleTest() {
        softAssert.assertEquals(driver.getTitle(), "Home Page");
        softAssert.assertAll();
    }

    // Assert User is logged in
    @Test(priority = 4)
    public void userLoginTest() {
        WebElement loginForm = driver.findElement(By.id("user-icon"));
        loginForm.click();
        WebElement login = driver.findElement(By.id("name"));
        login.sendKeys(LOGIN);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(PASSWORD);
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        WebElement userName = driver.findElement(By.id("user-name"));
        softAssert.assertEquals(userName.getText(), "ROMAN IOVLEV");
        softAssert.assertAll();
    }

    // Assert that there are 4 items on the header section are displayed and they have proper texts
    @Test(priority = 5)
    public void headerItemNamesTest() {
        List<WebElement> headerItems = driver.findElements(By.cssSelector("ul.nav > li"));
        softAssert.assertEquals(headerItems.size(), 4);
        for (WebElement element : headerItems) {
            softAssert.assertTrue(element.isDisplayed());
        }
        softAssert.assertEquals(headerItems.get(0).getText(), "HOME");
        softAssert.assertEquals(headerItems.get(1).getText(), "CONTACT FORM");
        softAssert.assertEquals(headerItems.get(2).getText(), "SERVICE");
        softAssert.assertEquals(headerItems.get(3).getText(), "METALS & COLORS");
        softAssert.assertAll();
    }

    // Assert that there are 4 images on the Index Page and they are displayed
    @Test(priority = 6)
    public void indexPageImagesTest() {
        List<WebElement> imagesItems = driver.findElements(By.cssSelector("div.benefit-icon"));
        softAssert.assertEquals(imagesItems.size(), 4);
        for (WebElement element : imagesItems) {
            softAssert.assertTrue(element.isDisplayed());
        }
        softAssert.assertAll();
    }

    // Assert that there are 4 texts on the Index Page under icons and they have proper text
    @Test(priority = 7)
    public void indexPageTextTest() {
        List<WebElement> textItems = driver.findElements(By.cssSelector("span.benefit-txt"));
        softAssert.assertEquals(textItems.size(), 4);
        for (WebElement element : textItems) {
            softAssert.assertTrue(element.isDisplayed());
        }
        softAssert.assertEquals(textItems.get(0).getText(), "To include good practices\n"
                + "and ideas from successful\n"
                + "EPAM project");
        softAssert.assertEquals(textItems.get(1).getText(), "To be flexible and\n"
                + "customizable");
        softAssert.assertEquals(textItems.get(2).getText(), "To be multiplatform");
        softAssert.assertEquals(textItems.get(3).getText(), "Already have good base\n"
                + "(about 20 internal and\n"
                + "some external projects),\n"
                + "wish to get more…");
        softAssert.assertAll();
    }

    // Assert that there is the iframe with “Frame Button” exist and “Frame Button” in the iframe
    @Test(priority = 8)
    public void frameButtonTest() {
        WebElement frameElement = driver.findElement(By.id("frame"));
        softAssert.assertTrue(frameElement.isDisplayed());
        driver.switchTo().frame(frameElement);
        WebElement frameBtn = driver.findElement(By.id("frame-button"));
        softAssert.assertTrue(frameBtn.isDisplayed());
        driver.switchTo().defaultContent();
        softAssert.assertAll();
    }

    // Assert that there are 5 items in the Left Section are displayed and they have proper text
    @Test(priority = 11)
    public void leftSectionTest() {
        List<WebElement> leftSectionElements =
                driver.findElements(By.cssSelector("ul.sidebar-menu.left>li"));
        softAssert.assertEquals(leftSectionElements.size(), 5);
        softAssert.assertEquals(leftSectionElements.get(0).getText(), "Home");
        softAssert.assertEquals(leftSectionElements.get(1).getText(), "Contact form");
        softAssert.assertEquals(leftSectionElements.get(2).getText(), "Service");
        softAssert.assertEquals(leftSectionElements.get(3).getText(), "Metals & Colors");
        softAssert.assertEquals(leftSectionElements.get(4).getText(), "Elements packs");
        softAssert.assertAll();
    }
}
