package ru.training.at.hw5.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.training.at.hw5.context.TestContext;
import ru.training.at.hw5.pages.UserTablePage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserTablePageSteps {

    @When("I click on \"Service\" button in Header")
    public void clickServiceButtonInHeader() {
        new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getServiceElement().click();
    }

    @And("I click on \"User Table\" button in Service dropdown")
    public void clickUserTableButtonInServiceDropdown() {
        new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getUserTablePageElement().click();
    }

    @Then("{string} page should be opened")
    public void userTablePageIsOpened(String pageTitle) {
        WebDriver driver = TestContext.getInstance().getTestObject(TestContext.WEB_DRIVER);
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }

    @And("{int} Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void dropdownNumberAreDisplayed(int expectedNumber) {
        int actualNumber = new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getDropdowns().size();
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @And("{int} Usernames should be displayed on Users Table on User Table Page")
    public void usernamesNumberAreDisplayed(int expectedNumber) {
        int actualNumber = new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getUserNames().size();
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @And("{int} Description texts under images should be "
            + "displayed on Users Table on User Table Page")
    public void descriptionsNumberAreDisplayed(int expectedNumber) {
        int actualNumber = new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getDescriptions().size();
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @And("{int} checkboxes should be displayed on Users Table on User Table Page")
    public void checkboxesNumberAreDisplayed(int expectedNumber) {
        int actualNumber = new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getCheckboxes().size();
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @And("User table should contain following values:")
    public void userTableContainValues(DataTable dataTable) {
        UserTablePage userTablePage = new UserTablePage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER));
        List<Map<String, String>> expectedTable = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < expectedTable.size(); i++) {
            Assert.assertEquals(userTablePage.getNumbersText(i),
                    expectedTable.get(i).get("Number"));
            Assert.assertEquals(userTablePage.getUserNameText(i),
                    expectedTable.get(i).get("User"));
            Assert.assertEquals(userTablePage.getDescriptionsText(i),
                    expectedTable.get(i).get("Description"));
        }
    }

    @And("droplist should contain values in column Type for user Roman")
    public void dpropListForRomanContainsValues(List<String> list) {
        List<String> expectedList = list.stream().skip(1).collect(Collectors.toList());
        for (int i = 0; i < expectedList.size(); i++) {
            Assert.assertEquals(new UserTablePage(TestContext.getInstance()
                    .getTestObject(TestContext.WEB_DRIVER))
                    .getDropdownOptionText(i), expectedList.get(i));
        }
    }
}
