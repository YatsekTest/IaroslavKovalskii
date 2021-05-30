package ru.training.at.hw5.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.training.at.hw5.context.TestContext;
import ru.training.at.hw5.pages.ServiceDifferentElementsPage;

import java.util.List;

import static ru.training.at.hw5.testdata.TestData.LOG_TEXTS;

public class DifferentElementsPageSteps {

    @When("I open Different Elements page from header menu Service")
    public void openDifferentElementsPage() {
        new ServiceDifferentElementsPage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).openDifferentElementPage();
    }

    @And("I select checkboxes 'Water', 'Wind'")
    public void selectCheckboxes() {
        new ServiceDifferentElementsPage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).selectCheckboxes();
    }

    @And("I select radio 'Selen'")
    public void selectRadio() {
        new ServiceDifferentElementsPage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).selectRadioBtn();
    }

    @And("I select 'Yellow' in dropdown menu")
    public void selectDropdown() {
        new ServiceDifferentElementsPage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).selectDropdown();
    }

    @Then("Logs corresponding to the selected items are displayed")
    public void assertLogs() {
        List<WebElement> logRows = new ServiceDifferentElementsPage(TestContext.getInstance()
                .getTestObject(TestContext.WEB_DRIVER)).getLogRows();
        for (int i = 0; i < logRows.size(); i++) {
            Assert.assertTrue(logRows.get(i).getText().contains(LOG_TEXTS[i]));
        }
    }
}
