package ru.training.at.hw4.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.training.at.hw4.pages.ServiceDifferentElementsPage;
import ru.training.at.hw4.testdata.TestData;

import java.util.List;

import static ru.training.at.hw4.testdata.TestData.*;

@Story(value = "Different Elements page.")
public class ExerciseTwoTest extends BaseTest {

    ServiceDifferentElementsPage servDiffPage;

    @BeforeClass
    private void setUpTests() {
        servDiffPage = new ServiceDifferentElementsPage(driver);
    }

    // Assert Browser title
    @Test(priority = 2)
    public void browserTitleTest() {
        servDiffPage.openPage(TestData.URL);
        Assert.assertEquals(driver.getTitle(), HOME_PAGE_TITLE);
    }

    @Description(value = "Assert User is logged in.")
    @Test(priority = 4)
    public void userLoginTest() {
        servDiffPage.login(USERNAME, PASSWORD);
        Assert.assertEquals(servDiffPage.getLoggedUserName(), LOGGED_USER_NAME);
    }

    @Description(value = "Open through the header menu Service -> Different Elements Page.")
    @Test(priority = 5)
    public void openDifferentElementPageTest() {
        servDiffPage.openDifferentElementPage();
        Assert.assertEquals(driver.getTitle(), SERVICE_DIFFERENT_PAGE_TITLE);
    }

    @Description(value = "Select checkboxes Water, Wind.")
    @Test(priority = 6)
    public void checkboxesTest() {
        servDiffPage.selectCheckboxes();
        Assert.assertTrue(servDiffPage.getWaterCheckbox().isSelected());
        Assert.assertTrue(servDiffPage.getWindCheckbox().isSelected());
    }

    @Description(value = "Select radio Selen.")
    @Test(priority = 7)
    public void radioTest() {
        servDiffPage.selectRadioBtn();
        Assert.assertTrue(servDiffPage.getSelenRadioBtn().isSelected());
    }

    @Description(value = "Select in dropdown Yellow.")
    @Test(priority = 8)
    public void dropdownTest() {
        servDiffPage.selectDropdown();
        Assert.assertTrue(servDiffPage.getYellowDropdown().isSelected());
    }

    @Description(value = "Assert that\n"
            + "    •  for each checkbox there is an individual "
            + "log row and value is corresponded to the\n"
            + "       status of checkbox\n"
            + "    •  for radio button there is a log row and value "
            + "is corresponded to the status of radio button\n"
            + "    •  for dropdown there is a log row and value "
            + "is corresponded to the selected value.")
    @Test(priority = 9)
    public void logRowsTest() {
        List<WebElement> logRows = servDiffPage.getLogRows();
        for (int i = 0; i < logRows.size(); i++) {
            Assert.assertTrue(logRows.get(i).getText().contains(LOG_TEXTS[i]));
        }
    }

}
