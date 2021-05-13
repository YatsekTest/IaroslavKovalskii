package ru.training.at.hw2.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw2.BaseTest;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ExerciseTwoTest extends BaseTest {

    // Assert Browser title
    @Test(priority = 2)
    public void browserTitleTest() {
        assertEquals(driver.getTitle(), "Home Page");
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
        assertEquals(userName.getText(), "ROMAN IOVLEV");
    }

    // Open through the header menu Service -> Different Elements Page
    @Test(priority = 5)
    public void openDifferentElementPageTest() {
        WebElement serviceElement =
                driver.findElement(By.xpath("//a[contains(text(), 'Service')]"));
        serviceElement.click();
        WebElement differentElementsPageElement =
                driver.findElement(By.xpath("//a[contains(text(), 'Different elements')]"));
        differentElementsPageElement.click();
    }

    // Select checkboxes Water, Wind
    @Test(priority = 6)
    public void checkboxesTest() {
        List<WebElement> checkboxElements =
                driver.findElements(By.cssSelector("input[type=checkbox]"));
        WebElement windCheckbox = checkboxElements.get(0);
        windCheckbox.click();
        assertTrue(windCheckbox.isSelected());
        WebElement waterCheckbox = checkboxElements.get(2);
        waterCheckbox.click();
        assertTrue(waterCheckbox.isSelected());
    }

    // Select radio Selen
    @Test(priority = 7)
    public void radioTest() {
        WebElement selenRadio =
                driver.findElement(By.xpath("//label[@class='label-radio' "
                        + "and contains(.,'Selen')]"));
        selenRadio.click();
        Assert.assertTrue(selenRadio.isSelected());
    }

    // Select in dropdown Yellow
    @Test(priority = 8)
    public void dropdownTest() {
        WebElement yellowDropdown =
                driver.findElement(By.xpath("//option[contains(text(), 'Yellow')]"));
        yellowDropdown.click();
        assertTrue(yellowDropdown.isSelected());
    }

    /* Assert that
    •  for each checkbox there is an individual log row and value is corresponded to the
       status of checkbox
    •  for radio button there is a log row and value is corresponded to the status of radio button
    •  for dropdown there is a log row and value is corresponded to the selected value. */
    @Test(priority = 9)
    public void logRowsTest() {
        List<WebElement> logRows =
                driver.findElements(By.cssSelector("ul.panel-body-list.logs>li"));
        assertTrue(logRows.get(0).getText().contains("Colors: value changed to Yellow"));
        assertTrue(logRows.get(1).getText().contains("metal: value changed to Selen"));
        assertTrue(logRows.get(2).getText().contains("Wind: condition changed to true"));
        assertTrue(logRows.get(3).getText().contains("Water: condition changed to true"));
    }
}
