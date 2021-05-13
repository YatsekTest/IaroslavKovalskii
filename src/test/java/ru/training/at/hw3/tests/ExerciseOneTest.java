package ru.training.at.hw3.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

import static ru.training.at.hw3.testdata.TestData.*;

public class ExerciseOneTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    // Assert Browser title
    @Test(priority = 2)
    public void browserTitleTest() {
        mainJdiPage.openPage();
        softAssert.assertEquals(driver.getTitle(), HOME_PAGE_TITLE);
    }

    // Assert User is logged in
    @Test(priority = 4)
    public void userLoginTest() {
        mainJdiPage.login(USERNAME, PASSWORD);
        softAssert.assertEquals(mainJdiPage.getLoggedUserName(), LOGGED_USER_NAME);
    }

    // Assert that there are 4 items on the header section are displayed and they have proper texts
    @Test(priority = 5)
    public void headerItemNamesTest() {
        List<WebElement> headerItems = mainJdiPage.getHeaderItems();
        softAssert.assertEquals(headerItems.size(), HEADER_ITEMS_COUNT);
        List<String> headerItemTitles = new ArrayList<>();
        for (WebElement element : headerItems) {
            softAssert.assertTrue(element.isDisplayed());
            headerItemTitles.add(element.getText());
        }
        softAssert.assertEquals(headerItemTitles, HEADER_ITEMS_TITLES);
        softAssert.assertAll();
    }

    // Assert that there are 4 images on the Index Page and they are displayed
    @Test(priority = 6)
    public void indexPageImagesTest() {
        List<WebElement> imagesItems = mainJdiPage.getImageItems();
        softAssert.assertEquals(imagesItems.size(), BENEFIT_ITEMS_COUNT);
        for (WebElement element : imagesItems) {
            softAssert.assertTrue(element.isDisplayed());
        }
        softAssert.assertAll();
    }

    // Assert that there are 4 texts on the Index Page under icons and they have proper text
    @Test(priority = 7)
    public void indexPageTextTest() {
        List<WebElement> textItems = mainJdiPage.getTextItems();
        softAssert.assertEquals(textItems.size(), BENEFIT_ITEMS_COUNT);
        List<String> textItemTitles = new ArrayList<>();
        for (WebElement element : textItems) {
            softAssert.assertTrue(element.isDisplayed());
            textItemTitles.add(element.getText());
        }
        softAssert.assertEquals(textItemTitles, TEXT_ITEMS_TITLES);
        softAssert.assertAll();
    }

    // Assert that there is the iframe with “Frame Button” exist and “Frame Button” in the iframe
    @Test(priority = 8)
    public void frameButtonTest() {
        softAssert.assertTrue(mainJdiPage.getFrameElement().isDisplayed());
        softAssert.assertTrue(mainJdiPage.getFrameButton().isDisplayed());
        softAssert.assertAll();
        mainJdiPage.switchToDefaultContent();
    }

    // Assert that there are 5 items in the Left Section are displayed and they have proper text
    @Test(priority = 11)
    public void leftSectionTest() {
        List<WebElement> leftSectionElements = mainJdiPage.getLeftSectionElements();
        softAssert.assertEquals(leftSectionElements.size(), LEFT_SECTION_ELEMENTS_COUNT);
        List<String> leftSectionElementTitles = new ArrayList<>();
        for (WebElement element : leftSectionElements) {
            softAssert.assertTrue(element.isDisplayed());
            leftSectionElementTitles.add(element.getText());
        }
        softAssert.assertEquals(leftSectionElementTitles, LEFT_SECTION_TITLES);
        softAssert.assertAll();
    }


}
