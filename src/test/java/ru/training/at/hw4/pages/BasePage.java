package ru.training.at.hw4.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.training.at.hw4.testdata.TestData;

public class BasePage {

    WebDriver driver;

    @FindBy(id = "user-icon")
    private WebElement loginForm;

    @FindBy(id = "name")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(id = "user-name")
    private WebElement userName;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step(value = "Open page with {url} URL.")
    public void openPage(String url) {
        driver.get(url);
    }

    @Step(value = "Loggin in with {username} username and {password} password.")
    public void login(String username, String password) {
        loginForm.click();
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    @Step(value = "Get logged user name.")
    public String getLoggedUserName() {
        return userName.getText();
    }

}
