package ru.training.at.hw3.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.training.at.hw3.pages.ServiceDifferentElementsPage;

import java.util.List;

import static ru.training.at.hw3.testdata.TestData.*;
import static ru.training.at.hw3.testdata.TestData.LOGGED_USER_NAME;

public class ExerciseTwoTest extends BaseTest {

    ServiceDifferentElementsPage servDiffPage;

    @BeforeClass
    private void setUpTests() {
        servDiffPage = new ServiceDifferentElementsPage(driver);
    }

    // Assert Browser title
    @Test(priority = 2)
    public void browserTitleTest() {
        servDiffPage.openPage();
        Assert.assertEquals(driver.getTitle(), HOME_PAGE_TITLE);
    }

    // Assert User is logged in
    @Test(priority = 4)
    public void userLoginTest() {
        servDiffPage.login(USERNAME, PASSWORD);
        Assert.assertEquals(servDiffPage.getLoggedUserName(), LOGGED_USER_NAME);
    }

    // Open through the header menu Service -> Different Elements Page
    @Test(priority = 5)
    public void openDifferentElementPageTest() {
        servDiffPage.openDifferentElementPage();
        Assert.assertEquals(driver.getTitle(), SERVICE_DIFFERENT_PAGE_TITLE);
    }

    // Select checkboxes Water, Wind
    @Test(priority = 6)
    public void checkboxesTest() {
        servDiffPage.selectCheckboxes();
        Assert.assertTrue(servDiffPage.getWaterCheckbox().isSelected());
        Assert.assertTrue(servDiffPage.getWindCheckbox().isSelected());
    }

    // Select radio Selen
    @Test(priority = 7)
    public void radioTest() {
        servDiffPage.selectRadioBtn();
        Assert.assertTrue(servDiffPage.getSelenRadioBtn().isSelected());
    }

    // Select in dropdown Yellow
    @Test(priority = 8)
    public void dropdownTest() {
        servDiffPage.selectDropdown();
        Assert.assertTrue(servDiffPage.getYellowDropdown().isSelected());
    }

    /* Assert that
    •  for each checkbox there is an individual log row and value is corresponded to the
       status of checkbox
    •  for radio button there is a log row and value is corresponded to the status of radio button
    •  for dropdown there is a log row and value is corresponded to the selected value. */
    @Test(priority = 9)
    public void logRowsTest() {
        List<WebElement> logRows = servDiffPage.getLogRows();
        for (int i = 0; i < logRows.size(); i++) {
            Assert.assertTrue(logRows.get(i).getText().contains(LOG_TEXTS[i]));
        }
    }

}
