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
        softAssert.assertEquals(headerItems.size(), 4);
        List<String> itemsTitles = new ArrayList<>();
        for (WebElement element : headerItems) {
            softAssert.assertTrue(element.isDisplayed());
            itemsTitles.add(element.getText());
        }
        softAssert.assertEquals(itemsTitles, HEADER_ITEMS_TITLES);
        softAssert.assertAll();
    }

    // Assert that there are 4 images on the Index Page and they are displayed
    @Test(priority = 6)
    public void indexPageImagesTest() {
        List<WebElement> imagesItems = mainJdiPage.getImageItems();
        softAssert.assertEquals(imagesItems.size(), 4);
        for (WebElement element : imagesItems) {
            softAssert.assertTrue(element.isDisplayed());
        }
        softAssert.assertAll();
    }

    // Assert that there are 4 texts on the Index Page under icons and they have proper text
    @Test(priority = 7)
    public void indexPageTextTest() {

    }


}
