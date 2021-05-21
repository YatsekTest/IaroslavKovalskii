package ru.training.at.hw4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServiceDifferentElementsPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Service')]")
    private WebElement serviceElement;

    @FindBy(xpath = "//a[contains(text(), 'Different elements')]")
    private WebElement differentElementsPageElement;

    @FindBy(xpath = "//label[@class='label-checkbox' and contains (., 'Wind')]/input")
    private WebElement windCheckbox;

    @FindBy(xpath = "//label[@class='label-checkbox' and contains (., 'Water')]/input")
    private WebElement waterCheckbox;

    @FindBy(xpath = "//label[@class='label-radio' and contains (., 'Selen')]/input")
    private WebElement selenRadioBtn;

    @FindBy(xpath = "//option[contains(text(), 'Yellow')]")
    private WebElement yellowDropdown;

    @FindBy(css = "ul.panel-body-list.logs>li")
    private List<WebElement> logRows;

    public ServiceDifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openDifferentElementPage() {
        serviceElement.click();
        differentElementsPageElement.click();
    }

    public void selectCheckboxes() {
        waterCheckbox.click();
        windCheckbox.click();
    }

    public void selectRadioBtn() {
        selenRadioBtn.click();
    }

    public void selectDropdown() {
        yellowDropdown.click();
    }

    public WebElement getWindCheckbox() {
        return windCheckbox;
    }

    public WebElement getWaterCheckbox() {
        return waterCheckbox;
    }

    public WebElement getSelenRadioBtn() {
        return selenRadioBtn;
    }

    public WebElement getYellowDropdown() {
        return yellowDropdown;
    }

    public List<WebElement> getLogRows() {
        return logRows;
    }
}
