package ru.training.at.hw5.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
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

}
