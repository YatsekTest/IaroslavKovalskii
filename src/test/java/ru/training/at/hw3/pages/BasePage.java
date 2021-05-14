package ru.training.at.hw3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.training.at.hw3.testdata.TestData;

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

    public void openPage() {
        driver.get(TestData.URL);
    }

    public void login(String username, String password) {
        loginForm.click();
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public String getLoggedUserName() {
        return userName.getText();
    }

}
