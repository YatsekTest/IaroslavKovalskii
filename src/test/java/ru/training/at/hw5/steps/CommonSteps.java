package ru.training.at.hw5.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import ru.training.at.hw5.context.TestContext;
import ru.training.at.hw5.pages.MainJdiPage;

import static ru.training.at.hw5.testdata.TestData.*;

public class CommonSteps {

    @Given("I open main Jdi page")
    public void openJdiPage() {
        new MainJdiPage(TestContext.getInstance().getTestObject(TestContext.WEB_DRIVER))
                .openPage(URL);
    }

    @And("I login as user 'Roman Iovlev'")
    public void login() {
        new MainJdiPage(TestContext.getInstance().getTestObject(TestContext.WEB_DRIVER))
                .login(USERNAME, PASSWORD);
    }

}
